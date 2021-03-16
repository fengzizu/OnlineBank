package com.fourgroup.pojo;

import java.io.Serializable;

/**
 * (Card)实体类
 *
 * @author makejava
 * @since 2020-08-27 15:48:30
 */
public class Card implements Serializable {
    private static final long serialVersionUID = 507768276767763792L;
    
    private String cardid;
    
    private String password;
    
    private String certificatetype;
    
    private String certificatenum;
    
    private String realname;
    
    private Integer sex;
    
    private String phonenum;
    
    private String fixphone;
    
    private String address;
    
    private String postcode;
    
    private String eMail;
    
    private Integer networkid;
    
    private Integer cardtypeid;
    
    private Integer issigned;
    
    private String alias;
    
    private Integer state;
    
    private String obuserid;
    private String newpassword;
    private String cardtypename;

    public String getCardtypename() {
        return cardtypename;
    }

    public void setCardtypename(String cardtypename) {
        this.cardtypename = cardtypename;
    }

    public String getNetworkname() {
        return networkname;
    }

    public void setNetworkname(String networkname) {
        this.networkname = networkname;
    }

    public Double getRemain() {
        return remain;
    }

    public void setRemain(Double remain) {
        this.remain = remain;
    }

    private String networkname;
    private Double remain;
    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCertificatetype() {
        return certificatetype;
    }

    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype;
    }

    public String getCertificatenum() {
        return certificatenum;
    }

    public void setCertificatenum(String certificatenum) {
        this.certificatenum = certificatenum;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getFixphone() {
        return fixphone;
    }

    public void setFixphone(String fixphone) {
        this.fixphone = fixphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public Integer getNetworkid() {
        return networkid;
    }

    public void setNetworkid(Integer networkid) {
        this.networkid = networkid;
    }

    public Integer getCardtypeid() {
        return cardtypeid;
    }

    public void setCardtypeid(Integer cardtypeid) {
        this.cardtypeid = cardtypeid;
    }

    public Integer getIssigned() {
        return issigned;
    }

    public void setIssigned(Integer issigned) {
        this.issigned = issigned;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getObuserid() {
        return obuserid;
    }

    public void setObuserid(String obuserid) {
        this.obuserid = obuserid;
    }

}