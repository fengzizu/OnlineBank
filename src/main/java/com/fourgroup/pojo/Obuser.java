package com.fourgroup.pojo;

import java.io.Serializable;

/**
 * (Obuser)实体类
 *
 * @author makejava
 * @since 2020-08-26 17:02:32
 */
public class Obuser implements Serializable {
    private static final long serialVersionUID = -21727167948417795L;
    
    private String obuserid;
    
    private String obusername;
    
    private String obuserpassword;
    
    private String certificatetype;
    
    private String certificatenum;
    
    private String realname;
    
    private Integer sex;
    
    private String phonenum;
    
    private String fixphone;
    
    private String eMail;
    
    private Integer state;


    public String getObuserid() {
        return obuserid;
    }

    public void setObuserid(String obuserid) {
        this.obuserid = obuserid;
    }

    public String getObusername() {
        return obusername;
    }

    public void setObusername(String obusername) {
        this.obusername = obusername;
    }

    public String getObuserpassword() {
        return obuserpassword;
    }

    public void setObuserpassword(String obuserpassword) {
        this.obuserpassword = obuserpassword;
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

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}