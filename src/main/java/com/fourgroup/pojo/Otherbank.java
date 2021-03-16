package com.fourgroup.pojo;

import java.io.Serializable;

/**
 * (Otherbank)实体类
 *
 * @author makejava
 * @since 2020-08-27 23:46:32
 */
public class Otherbank implements Serializable {
    private static final long serialVersionUID = 734942507775334225L;
    
    private String obcardid;
    
    private String name;
    
    private String network;


    public String getObcardid() {
        return obcardid;
    }

    public void setObcardid(String obcardid) {
        this.obcardid = obcardid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

}