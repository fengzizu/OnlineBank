package com.fourgroup.pojo;

import java.io.Serializable;

/**
 * (Accountremain)实体类
 *
 * @author makejava
 * @since 2020-09-01 16:56:20
 */
public class Accountremain implements Serializable {
    private static final long serialVersionUID = -41554544064191676L;
    
    private Integer arid;
    
    private String cardid;
    
    private Double remain;


    public Integer getArid() {
        return arid;
    }

    public void setArid(Integer arid) {
        this.arid = arid;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public Double getRemain() {
        return remain;
    }

    public void setRemain(Double remain) {
        this.remain = remain;
    }

}