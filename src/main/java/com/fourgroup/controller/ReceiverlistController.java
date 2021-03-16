package com.fourgroup.controller;

import com.fourgroup.pojo.*;
import com.fourgroup.service.CardService;
import com.fourgroup.service.NetworkService;
import com.fourgroup.service.OtherbankService;
import com.fourgroup.service.ReceiverlistService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Receiverlist)表控制层
 *
 * @author makejava
 * @since 2020-08-27 23:45:45
 */
@RestController
public class ReceiverlistController {
    /**
     * 服务对象
     */
    @Autowired
    private ReceiverlistService receiverlistService;
    @Autowired
    private CardService cardService;
    @Autowired
    private OtherbankService otherbankService;
    @Autowired
    private NetworkService networkService;
    @RequestMapping("/findreceiverlist")
    @ResponseBody
    public Map findreclist(HttpServletRequest request, @RequestBody Obuser obuser){
        Map rec = new HashMap();
        List<Receiverlist> reclist = receiverlistService.findlist(obuser.getObuserid());
        for (int i = 0 ;i <reclist.size();i++){
        Receiverlist r = (Receiverlist)reclist.get(i);
        r.setUsername((cardService.queryById(r.getCardid())).getRealname());
        r.setNetwork((cardService.queryById(r.getCardid())).getNetworkid());
        }
        rec.put("reclist",reclist);
        return rec;
    }
    @RequestMapping("/findotherreceiverlist")
    @ResponseBody
    public Map findotherreclist(HttpServletRequest request, @RequestBody Obuser obuser){
        Map recother = new HashMap();
        List<Receiverlist> reclist = receiverlistService.findotherlist(obuser.getObuserid());
        for (int i = 0 ;i <reclist.size();i++){
            Receiverlist r = (Receiverlist)reclist.get(i);
            r.setNetworkname((otherbankService.queryById(r.getCardid())).getNetwork());
        }

        recother.put("reclist",reclist);
        return recother;
    }
    @RequestMapping("/findreceiverlistbyget")
    public Map findreceiverlistbyget(HttpServletRequest request){
        Map rec = new HashMap();
        HttpSession session = request.getSession();
        List<Receiverlist> reclist = receiverlistService.findlist((String) session.getAttribute("obuserid"));
        for (int i = 0 ;i <reclist.size();i++){
            Receiverlist r = (Receiverlist)reclist.get(i);
            r.setUsername((cardService.queryById(r.getCardid())).getRealname());
            r.setNetwork((cardService.queryById(r.getCardid())).getNetworkid());
            r.setNetworkname(networkService.queryById(r.getNetwork()).getNetname());
        }
        rec.put("reclist",reclist);
        return rec;
    }
    @RequestMapping("/findotherreceiverlistbyget")
    public Map findotherreceiverlistbyget(HttpServletRequest request){
        Map recother = new HashMap();
        HttpSession session = request.getSession();
        List<Receiverlist> reclist = receiverlistService.findotherlist((String) session.getAttribute("obuserid"));
        for (int i = 0 ;i <reclist.size();i++){
            Receiverlist r = (Receiverlist)reclist.get(i);
            r.setNetworkname((otherbankService.queryById(r.getCardid())).getNetwork());
        }

        recother.put("reclist",reclist);
        return recother;
    }
    @RequestMapping("/addreceiverlist")
    @ResponseBody
    public Map addreceiverlist(HttpServletRequest request, @RequestBody Receiverlist receiverlist){
        HttpSession session = request.getSession();
        Map recother = new HashMap();
        String message = "";
        Card card2compare = new Card();
        if (receiverlist.getCardid()!=null)
            card2compare = cardService.queryById(receiverlist.getCardid());
        if (card2compare!= null&&session.getAttribute("obuserid")!=null){
            receiverlist.setObuserid((String)session.getAttribute("obuserid"));
            Receiverlist receiverlist2compare = receiverlistService.queryByObuseridAndCardid(receiverlist);
            if (receiverlist2compare != null){
                System.out.println("11111111");
                message ="已绑定";
            }else if (card2compare.getPhonenum().equals(receiverlist.getPhone())&&card2compare.getRealname().equals(receiverlist.getUsername())){
                receiverlist.setType(0);
                receiverlistService.insert(receiverlist);
                message = "增加成功";
            }else {
                message = "信息错误";
            }
        }
        recother.put("message",message);
        return recother;
    }
    @RequestMapping("/addotherreceiverlist")
    @ResponseBody
    public Map addotherreceiverlist(HttpServletRequest request, @RequestBody Receiverlist receiverlist){
        HttpSession session = request.getSession();
        Map recother = new HashMap();
        String message = "";
        Otherbank otherbank = new Otherbank();
        if (receiverlist.getCardid()!=null&&session.getAttribute("obuserid")!=null){
            receiverlist.setObuserid((String)session.getAttribute("obuserid"));
            otherbank = otherbankService.queryById(receiverlist.getCardid());
            if (otherbank!=null&&receiverlist.getNetworkname().equals(otherbank.getNetwork())&&receiverlist.getName().equals(otherbank.getName())){
                Receiverlist receiverlist2compare = receiverlistService.queryByObuseridAndCardid(receiverlist);
                if (receiverlist2compare == null){
                    receiverlist.setType(1);
                    receiverlistService.insert(receiverlist);
                    message = "绑定成功";
                }else {
                    message = "已绑定";
                }
            }else {
                message = "输入错误";
            }
        }
        recother.put("message",message);
        return recother;
    }
    @RequestMapping("/deletereceiverlist")
    @ResponseBody
    public Map deletereceiverlist(HttpServletRequest request, @RequestBody List<Receiverlist> receiverlist){
        HttpSession session = request.getSession();
        Map recother = new HashMap();
        String message = "";
        if (receiverlist!=null&&session.getAttribute("obuserid")!=null){
            Receiverlist receiverlist2compare = new Receiverlist();
            for (int i = 0; i<receiverlist.size();i++){
                Receiverlist c  = (Receiverlist)receiverlist.get(i);
                System.out.println(c.getCardid());
                c.setObuserid((String)session.getAttribute("obuserid"));
                receiverlist2compare = receiverlistService.queryByObuseridAndCardid(c);
                if(receiverlist2compare != null){
                    receiverlistService.deleteById(receiverlist2compare.getReceiverid());
                }
                message = "删除成功";

            }
        }
        recother.put("message",message);
        return recother;
    }
    @RequestMapping("/deleteohtherreceiverlist")
    @ResponseBody
    public Map deleteohtherreceiverlist(HttpServletRequest request, @RequestBody List<Receiverlist> receiverlist){
        HttpSession session = request.getSession();
        Map recother = new HashMap();
        String message = "";
        if (receiverlist!=null&&session.getAttribute("obuserid")!=null){
            Receiverlist receiverlist2compare = new Receiverlist();
            for (int i = 0; i<receiverlist.size();i++){
                Receiverlist c  = (Receiverlist)receiverlist.get(i);
                System.out.println(c.getCardid());
                c.setObuserid((String)session.getAttribute("obuserid"));
                receiverlist2compare = receiverlistService.queryByObuseridAndCardid(c);
                if(receiverlist2compare != null){
                    receiverlistService.deleteById(receiverlist2compare.getReceiverid());
                }
                message = "删除成功";

            }
        }
        recother.put("message",message);
        return recother;
    }


}