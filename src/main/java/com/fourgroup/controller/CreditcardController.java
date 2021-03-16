package com.fourgroup.controller;

import com.fourgroup.pojo.Card;
import com.fourgroup.pojo.Creditcard;
import com.fourgroup.pojo.Obuser;
import com.fourgroup.service.CardService;
import com.fourgroup.service.CreditcardService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Creditcard)表控制层
 *
 * @author makejava
 * @since 2020-08-28 09:59:00
 */
@RestController
public class CreditcardController {//控制层
    /**
     * 服务对象
     */
    @Autowired
    private CreditcardService   creditcardService;//扫描层
    @Autowired
    private CardService cardService;//扫描层

    @RequestMapping("/querystate")//请求映射
    @ResponseBody//响应
    public Map querystate(HttpServletRequest request, @RequestBody Creditcard creditcard){
        Map jsonMap  = new HashMap();
        String message = "";
        creditcard = creditcardService.queryByCidAndPassword(creditcard);
        if(creditcard == null){
            message = "输入错误";
        }else {
            if (creditcard.getState() == 3) {
                message = "审核通过";
            } else if (creditcard.getState() == 1) {
                message = "正在审核";
            } else if (creditcard.getState() == 2) {
                message = "审核未通过";
            } else if (creditcard.getState() == 0) {
                message = "已通过审核正常使用";
            }
        }
        jsonMap.put("message",message);
        return jsonMap;

    }
    @RequestMapping("/getcredictcardlist") //请求映射
    @ResponseBody//响应
    public Map getcredictcardlist(HttpServletRequest request, @RequestBody Obuser obuser){
        Map jsonMap  = new HashMap();
        List<Card> creditcardlist = cardService.findCreditcardlist(obuser.getObuserid());
        jsonMap.put("creditcardlist",creditcardlist);
        return jsonMap;

    }
    @RequestMapping("/getcredictcardlistbyget")//请求映射
    public Map getcredictcardlistbyget(HttpServletRequest request){
        Map jsonMap  = new HashMap();//集合运用HashMap表
        HttpSession session = request.getSession();
        System.out.println(session.getAttribute("obuserid"));
        Obuser obuser = new Obuser();
        obuser.setObuserid((String)session.getAttribute("obuserid"));
        List<Card> creditcardlist = cardService.findCreditcardlist(obuser.getObuserid());
        jsonMap.put("creditcardlist",creditcardlist);
        return jsonMap;

    }
    @RequestMapping("/changedealpassword")//请求映射
    @ResponseBody
    public Map changedealpassword(HttpServletRequest request, @RequestBody Card card){
        Map jsonMap  = new HashMap();
        Card card2compare = cardService.queryById(card.getCardid());
        //System.out.println(card2compare.getPassword());
        //System.out.println(card.getPassword());
        String message = "";
        if (card2compare!= null){
            String str1 = card2compare.getPassword();
            String str2 = card.getPassword();

            //System.out.println(str1.equals(str2));
            if(str1.equals(str2)){
                card2compare.setPassword(card.getNewpassword());
                cardService.update(card2compare);
                message = "修改成功";
            }else {
                message = "密码错误";
            }
        }else {
            message="无该卡信息";
        }

        jsonMap.put("message",message);
        return jsonMap;

    }
    @RequestMapping("/changequerypassword")
    @ResponseBody
    public Map changequerypassword(HttpServletRequest request, @RequestBody Creditcard card){
        Map jsonMap  = new HashMap();
        String newpassword = card.getNewquerypassword();
        card = creditcardService.queryByCidAndPassword(card);
        String message ="";
        if(card!=null){
            card.setQuerypassword(newpassword);
            creditcardService.update(card);
            message = "修改成功";
        }else {
            message = "密码错误";
        }
        jsonMap.put("message",message);
        return jsonMap;

    }
    @RequestMapping("/activatecard")
    @ResponseBody
    public Map activatecard(HttpServletRequest request, @RequestBody Creditcard card){
        Map jsonMap  = new HashMap();
        String message ="";
        if(card.getCardid()!=null){
            card = creditcardService.queryByCid(card.getCardid());
        }else {
            message = "卡号不存在";
        }

        System.out.println(card.getState());
        if(card!=null){
            if (card.getState()==0){
                message = "已激活";
            }
            if (card.getState()==1||card.getState()==2){
                message = "正在审核";
            }
            if (card.getState()==3){
                card.setState(0);
                creditcardService.update(card);
                message = "激活成功";
            }



        }else {
            message = "卡号不存在";
        }
        jsonMap.put("message",message);
        return jsonMap;

    }
        @RequestMapping("/creditcardgetlost")
    @ResponseBody
    public Map creditcardgetlost(HttpServletRequest request, @RequestBody Creditcard card){
        Map jsonMap  = new HashMap();
        card = creditcardService.queryByCidAndPassword(card);
        String message ="";
        if(card!=null){
            Card card2change = cardService.queryById(card.getCardid());
            if(card2change.getState()==2){
                message = "已挂失";
            }else {
                card2change.setState(2);
                cardService.update(card2change);
                message = "挂失成功";
            }
        }else {
            message = "密码错误";
        }
        jsonMap.put("message",message);
        return jsonMap;

    }
}