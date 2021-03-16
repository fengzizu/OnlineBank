package com.fourgroup.controller;

import com.fourgroup.pojo.Accountremain;
import com.fourgroup.pojo.Card;
import com.fourgroup.pojo.Dealdetail;
import com.fourgroup.pojo.Otherbank;
import com.fourgroup.service.AccountremainService;
import com.fourgroup.service.CardService;
import com.fourgroup.service.DealdetailService;
import com.fourgroup.service.OtherbankService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * (Dealdetail)表控制层
 *
 * @author makejava
 * @since 2020-09-02 21:46:32
 */
@RestController
public class DealdetailController {
    /**
     * 服务对象
     */
    @Autowired
    private DealdetailService dealdetailService;
    @Autowired
    private CardService cardService;
    @Autowired
    private AccountremainService accountremainService;
    @Autowired
    private OtherbankService otherbankService;

    @RequestMapping("/finddealdetailbycard")
    @ResponseBody
    public Map finddealdetailbycard(HttpServletRequest request, @RequestBody Dealdetail dealdetail) throws ParseException {
        HttpSession session = request.getSession();
        Map recother = new HashMap();
        String message = "";
        List<Dealdetail> dealdetailList = null;
        if (dealdetail.getCardid() != null) {
            dealdetailList = dealdetailService.queryByCardid(dealdetail.getCardid());
//            for (int i = 0; i<dealdetailList.size();i++){
//                Dealdetail d = (Dealdetail)dealdetailList.get(i);
//                System.out.println(d.getDealtime());
//            }

            if (dealdetail.getStarttime() != null && dealdetail.getEndtime() != null) {
                List<Dealdetail> dealdetailListwithtime = new ArrayList<Dealdetail>();
                {
                }
                ;
                String str1[] = dealdetail.getStarttime().split("/");
                String str2[] = dealdetail.getEndtime().split("/");
                String newString1 = str1[2] + "-" + str1[0] + "-" + str1[1];
                String newString2 = str2[2] + "-" + str2[0] + "-" + str2[1];
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date dateTime1 = dateFormat.parse(newString1);
                Date dateTime2 = dateFormat.parse(newString2);
                for (int i = 0; i < dealdetailList.size(); i++) {
                    Dealdetail d = (Dealdetail) dealdetailList.get(i);
                    Date date = d.getDealtime();
                    int i1 = date.compareTo(dateTime1);
                    int i2 = date.compareTo(dateTime2);
                    if (i1 >= 0 && i2 <= 0) {
                        dealdetailListwithtime.add(d);
                    }
                }
                recother.put("Dealdetail", dealdetailListwithtime);
            } else {
                recother.put("Dealdetail", dealdetailList);
            }
        }

        recother.put("message", message);
        return recother;
    }

    @RequestMapping("/findinternetdealdetailbycard")
    @ResponseBody
    public Map findinternetdealdetailbycard(HttpServletRequest request, @RequestBody Dealdetail dealdetail) throws ParseException {
        HttpSession session = request.getSession();
        Map recother = new HashMap();
        String message = "";
        List<Dealdetail> dealdetailList = null;
        if (dealdetail.getCardid() != null) {
            dealdetailList = dealdetailService.queryByCardidInternet(dealdetail.getCardid());
//            for (int i = 0; i<dealdetailList.size();i++){
//                Dealdetail d = (Dealdetail)dealdetailList.get(i);
//                System.out.println(d.getDealtime());
//            }

            if (dealdetail.getStarttime() != null && dealdetail.getEndtime() != null) {
                List<Dealdetail> dealdetailListwithtime = new ArrayList<Dealdetail>();
                {
                }
                ;
                String str1[] = dealdetail.getStarttime().split("/");
                String str2[] = dealdetail.getEndtime().split("/");
                String newString1 = str1[2] + "-" + str1[0] + "-" + str1[1];
                String newString2 = str2[2] + "-" + str2[0] + "-" + str2[1];
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date dateTime1 = dateFormat.parse(newString1);
                Date dateTime2 = dateFormat.parse(newString2);
                for (int i = 0; i < dealdetailList.size(); i++) {
                    Dealdetail d = (Dealdetail) dealdetailList.get(i);
                    Date date = d.getDealtime();
                    int i1 = date.compareTo(dateTime1);
                    int i2 = date.compareTo(dateTime2);
                    if (i1 >= 0 && i2 <= 0) {
                        dealdetailListwithtime.add(d);
                    }
                }
                recother.put("Dealdetail", dealdetailListwithtime);
            } else {
                recother.put("Dealdetail", dealdetailList);
            }
        }

        recother.put("message", message);
        return recother;
    }


    @RequestMapping("/findtransferdealdetailbycard")
    @ResponseBody
    public Map findtransferdealdetailbycard(HttpServletRequest request, @RequestBody Dealdetail dealdetail) throws ParseException {
        HttpSession session = request.getSession();
        Map recother = new HashMap();
        String message = "";
        List<Dealdetail> dealdetailList = null;
        if (dealdetail.getCardid() != null) {
            dealdetailList = dealdetailService.queryByCardidTransfer(dealdetail.getCardid());
//            for (int i = 0; i<dealdetailList.size();i++){
//                Dealdetail d = (Dealdetail)dealdetailList.get(i);
//                System.out.println    (d.getDealtime());
//            }

            if (dealdetail.getStarttime() != null && dealdetail.getEndtime() != null) {
                List<Dealdetail> dealdetailListwithtime = new ArrayList<Dealdetail>();
                {
                }
                ;
                String str1[] = dealdetail.getStarttime().split("/");
                String str2[] = dealdetail.getEndtime().split("/");
                String newString1 = str1[2] + "-" + str1[0] + "-" + str1[1];
                String newString2 = str2[2] + "-" + str2[0] + "-" + str2[1];
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date dateTime1 = dateFormat.parse(newString1);
                Date dateTime2 = dateFormat.parse(newString2);
                for (int i = 0; i < dealdetailList.size(); i++) {
                    Dealdetail d = (Dealdetail) dealdetailList.get(i);
                    Date date = d.getDealtime();
                    int i1 = date.compareTo(dateTime1);
                    int i2 = date.compareTo(dateTime2);
                    if (i1 >= 0 && i2 <= 0) {
                        dealdetailListwithtime.add(d);
                    }
                }
                recother.put("Dealdetail", dealdetailListwithtime);
            } else {
                recother.put("Dealdetail", dealdetailList);
            }
        }

        recother.put("message", message);
        return recother;
    }

    @RequestMapping("/transownbank")
    @ResponseBody
    public Map transownbank(HttpServletRequest request, @RequestBody Dealdetail dealdetail) throws ParseException {
        HttpSession session = request.getSession();
        Map recother = new HashMap();
        String message = "";
        Card card = cardService.queryById(dealdetail.getCardid());
        if (card == null) {
            message = "卡号输入错误";
        } else {
            if (card.getPassword() != dealdetail.getPassword()) {
                Card card2trans = cardService.queryById(dealdetail.getObcardid());
                if (card2trans != null && card2trans.getRealname().equals(dealdetail.getObcardname())) {
                    if (accountremainService.queryByCardId(card.getCardid()).getRemain() >= dealdetail.getMoney()) {
                        Date date = new Date();
                        dealdetail.setDealtime(date);
                        dealdetail.setDealtypeid("0");
                        dealdetailService.insert(dealdetail);
                        double card1 = 0;
                        double card2 = 0;
                        card1 = accountremainService.queryByCardId(card.getCardid()).getRemain() - dealdetail.getMoney();
                        card2 = accountremainService.queryByCardId(card2trans.getCardid()).getRemain() + dealdetail.getMoney();
                        Accountremain acc1 = accountremainService.queryByCardId(card.getCardid());
                        acc1.setRemain(card1);
                        Accountremain acc2 = accountremainService.queryByCardId(card2trans.getCardid());
                        acc2.setRemain(card2);
                        accountremainService.update(acc1);
                        accountremainService.update(acc2);
                        message = "转账成功";
                    } else {
                        message = "余额不足";
                    }
                } else {
                    message = "收款人信息错误";
                }
            } else {
                message = "密码错误";
            }
        }


        recother.put("message", message);
        return recother;
    }

    @RequestMapping("/transotherbank")
    @ResponseBody
    public Map transotherbank(HttpServletRequest request, @RequestBody Dealdetail dealdetail) throws ParseException {
        HttpSession session = request.getSession();
        Map recother = new HashMap();
        String message = "";
        Card card = cardService.queryById(dealdetail.getCardid());
        if (card == null) {
            message = "卡号输入错误";
        } else {
            if (card.getPassword() != dealdetail.getPassword()) {
                Otherbank otherbank = otherbankService.queryById(dealdetail.getObcardid());
                if (otherbank != null && otherbank.getName().equals(dealdetail.getObcardname())) {
                    if (accountremainService.queryByCardId(card.getCardid()).getRemain() >= dealdetail.getMoney()) {
                        Date date = new Date();
                        dealdetail.setDealtime(date);
                        dealdetail.setDealtypeid("0");
                        dealdetailService.insert(dealdetail);
                        double card1 = 0;
                        card1 = accountremainService.queryByCardId(card.getCardid()).getRemain() - dealdetail.getMoney();
                        Accountremain acc1 = accountremainService.queryByCardId(card.getCardid());
                        acc1.setRemain(card1);
                        accountremainService.update(acc1);
                        message = "转账成功";
                    } else {
                        message = "余额不足";
                    }
                } else {
                    message = "收款人信息错误";
                }
            } else {
                message = "密码错误";
            }
        }


        recother.put("message", message);
        return recother;
    }


}