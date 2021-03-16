package com.fourgroup.biz.Impl;

import com.fourgroup.biz.ElectronicBiz;
import com.fourgroup.dao.ElectronicDao;
import com.fourgroup.pojo.Account;
import com.fourgroup.pojo.ElectronicReceipt;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service  //电子收据相关实现接口
public class ElectronicBizImpl implements ElectronicBiz {
    @Autowired
    ElectronicDao electronicDao;
    @Override
    public ElectronicReceipt findElectronic(ElectronicReceipt elec) {
        return electronicDao.findEle(elec);
    }

    @Override
    public Account findAccount(String account) {
       return electronicDao.findAcc(account);
    }
}
