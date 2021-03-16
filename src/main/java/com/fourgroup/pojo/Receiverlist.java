package com.fourgroup.pojo;

import java.io.Serializable;

/**
 * (Receiverlist)实体类
 *
 * @author makejava
 * @since 2020-08-27 23:45:45
 */
public class Receiverlist implements Serializable {
    private static final long serialVersionUID = -24554418650532645L;
    
    private Integer receiverid;
    
    private String obuserid;
    
    private Integer type;
    
    private String cardid;
    
    private String name;
    
    private Integer network;


    private String networkname;
    private String phone;
    private String username;


    public Integer getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(Integer receiverid) {
        this.receiverid = receiverid;
    }

    public String getObuserid() {
        return obuserid;
    }

    public void setObuserid(String obuserid) {
        this.obuserid = obuserid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNetwork() {
        return network;
    }

    public void setNetwork(Integer network) {
        this.network = network;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNetworkname() {
        return networkname;
    }

    public void setNetworkname(String networkname) {
        this.networkname = networkname;
    }
}