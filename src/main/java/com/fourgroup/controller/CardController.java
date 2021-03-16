package com.fourgroup.controller;

import com.fourgroup.pojo.Card;
import com.fourgroup.pojo.Obuser;
import com.fourgroup.pojo.Receiverlist;
import com.fourgroup.service.AccountremainService;
import com.fourgroup.service.CardService;
import com.fourgroup.service.CardtypeService;
import com.fourgroup.service.NetworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Card)表控制层
 *
 * @author makejava
 * @since 2020-08-27 15:48:32
 */
@RestController
public class CardController {
    /**
     * 服务对象
     */
    @Autowired
    private CardService cardService;
    @Autowired
    private AccountremainService accountremainService;
    @Autowired
    private NetworkService networkService;
    @Autowired
    private CardtypeService cardtypeService;

    /**
     *
     * @param request
     * @param obuser
     * @return
     */
    @RequestMapping("/findcard")
    @ResponseBody
    public Map findcardbyuser(HttpServletRequest request, @RequestBody Obuser obuser) {
        Map cardmap = new HashMap();
        List<Card> cards  = cardService.findcard(obuser.getObuserid());
        if (cards == null)
            System.out.println("noob");
        HttpSession session = request.getSession();
        System.out.println(session.getAttribute("obuserid"));
        cardmap.put("cardlist",cards);
        return cardmap;

    }
    @RequestMapping("/getlost")
    @ResponseBody
    public Card updatelost(HttpServletRequest request, @RequestBody Card card) {
        card.setState(2);
        cardService.update(card);
        System.out.println(card.getState());
        return card;

    }
    @RequestMapping("/findcardbyget")
    public Map findcardbyuserbyget(HttpServletRequest request) {
        Map cardmap = new HashMap();
        HttpSession session = request.getSession();
        Obuser obuser = new Obuser();
        obuser.setObuserid((String) session.getAttribute("obuserid"));
        List<Card> cards  = cardService.findcard(obuser.getObuserid());
        for (int i = 0 ;i <cards.size();i++){
            Card r = (Card)cards.get(i);
            if (networkService.queryById(r.getNetworkid()).getNetname()!=null)
                r.setNetworkname(networkService.queryById(r.getNetworkid()).getNetname());
            if (accountremainService.queryByCardId(r.getCardid()).getRemain()!=null)
                r.setRemain(accountremainService.queryByCardId(r.getCardid()).getRemain());
            if (cardtypeService.queryById(r.getCardtypeid()).getCardname()!=null)
                r.setCardtypename(cardtypeService.queryById(r.getCardtypeid()).getCardname());
        }
        cardmap.put("cardlist",cards);
        return cardmap;

    }
    @RequestMapping("/addcard")
    @ResponseBody
    public Map addcard(HttpServletRequest request, @RequestBody Card card) {
        Map json = new HashMap();
        HttpSession session = request.getSession();
        String message= "";
        System.out.println(card.getPhonenum());
        Card card2compare = new Card();
        if (card.getCardid()!=null)
            card2compare = cardService.queryById(card.getCardid());
        if (card2compare.getObuserid() != null){
            message = "该账号已绑定";
        }else if(card.getPassword().equals(card2compare.getPassword())&&card.getCertificatenum().equals(card2compare.getCertificatenum())&&card.getPhonenum().equals(card2compare.getPhonenum())){
            System.out.println(session.getAttribute("obuserid"));
            card2compare.setObuserid((String) session.getAttribute("obuserid"));
            cardService.update(card2compare);
            message ="绑定成功";
        }else {
            message="信息输入错误";
        }
        json.put("message",message);
        return json;

    }
    @RequestMapping("/deletecard")
    @ResponseBody
    public Map deletecard(HttpServletRequest request, @RequestBody List<Card> cardList) {
        Map json = new HashMap();
        String message = "";
        HttpSession session = request.getSession();
        for (int i = 0; i<cardList.size();i++){
            Card c  = (Card)cardList.get(i);
            System.out.println(c.getCardid());
            c.setObuserid("null");
            cardService.deleteobuser(c);
        }
        json.put("message",message);
        return json;

    }


}