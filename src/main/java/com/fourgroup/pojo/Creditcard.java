package com.fourgroup.pojo;

import java.io.Serializable;

/**
 * (Creditcard)实体类
 *
 * @author makejava
 * @since 2020-08-28 09:59:00
 */
public class Creditcard implements Serializable { //接口
    private static final long serialVersionUID = 572177981374860780L;
    
    private String cardid;
    
    private Integer state;
    
    private String querypassword;
    
    private Integer ccid;
    private String newquerypassword;

    public String getCardid() {
        return cardid;
    }

    public String getNewquerypassword() {
        return newquerypassword;
    }

    public void setNewquerypassword(String newquerypassword) {
        this.newquerypassword = newquerypassword;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getQuerypassword() {
        return querypassword;
    }

    public void setQuerypassword(String querypassword) {
        this.querypassword = querypassword;
    }

    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }

}//对应的各种方法