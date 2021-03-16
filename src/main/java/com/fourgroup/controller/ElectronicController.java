package com.fourgroup.controller;

import com.fourgroup.biz.ElectronicBiz;
import com.fourgroup.pojo.Account;
import com.fourgroup.pojo.ElectronicReceipt;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ElectronicController {
    @Autowired
    ElectronicBiz electronicBiz;

    @RequestMapping("/electronic")//在浏览器中请求映射
    //用map集合返回对应giveaccount，acceptaccount的值
    public Map searchElectronic(@RequestBody ElectronicReceipt elec) {
        Map umap = new HashMap();
        System.out.println(elec.getEletronicId());
        String storeId = elec.getEletronicId();
        elec = electronicBiz.findElectronic(elec);
        if (storeId != null) {
            elec.setEletronicId(storeId);
        }
        if (elec != null) {
            umap.put("electronic", elec);
            Account give = new Account();
            Account accept = new Account();
            give = electronicBiz.findAccount(elec.getGiveaccount());
            accept = electronicBiz.findAccount(elec.getAcceptaccount());
            System.out.println(give.getAccountname());
            System.out.println(accept.getAccountname());
            umap.put("giveaccount", give);
            umap.put("acceptaccount", accept);

            return umap;
        } else {
            return null;
        }

    }

}
