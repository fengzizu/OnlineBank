package com.fourgroup.pojo;

import java.io.Serializable;

/**
 * (Network)实体类
 *
 * @author makejava
 * @since 2020-09-01 17:09:44
 */
public class Network implements Serializable {
    private static final long serialVersionUID = -99201283072575491L;
    
    private Integer networkid;
    
    private String netname;


    public Integer getNetworkid() {
        return networkid;
    }

    public void setNetworkid(Integer networkid) {
        this.networkid = networkid;
    }

    public String getNetname() {
        return netname;
    }

    public void setNetname(String netname) {
        this.netname = netname;
    }

}