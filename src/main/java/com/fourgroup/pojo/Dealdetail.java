package com.fourgroup.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (Dealdetail)实体类
 *
 * @author makejava
 * @since 2020-09-02 21:46:32
 */
public class Dealdetail implements Serializable {
    private static final long serialVersionUID = 709884436659930529L;
    /**
    * 编号
    */
    private Long ddid;
    /**
    * 卡号
    */
    private String cardid;
    /**
    * 对方卡号
    */
    private String obcardid;
    /**
    * 交易类型
    */
    private String dealtypeid;
    /**
    * 交易金额
    */
    private Double money;
    /**
    * 交易时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date dealtime;
    private String starttime;
    private String endtime;
    private String obcardname;
    private String password;

    public Long getDdid() {
        return ddid;
    }

    public void setDdid(Long ddid) {
        this.ddid = ddid;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getObcardid() {
        return obcardid;
    }

    public void setObcardid(String obcardid) {
        this.obcardid = obcardid;
    }

    public String getDealtypeid() {
        return dealtypeid;
    }

    public void setDealtypeid(String dealtypeid) {
        this.dealtypeid = dealtypeid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getDealtime() {
        return dealtime;
    }

    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getObcardname() {
        return obcardname;
    }

    public void setObcardname(String obcardname) {
        this.obcardname = obcardname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}