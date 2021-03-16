package com.fourgroup.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Cardtype)实体类
 *
 * @author makejava
 * @since 2020-09-01 17:31:31
 */
public class Cardtype implements Serializable {
    private static final long serialVersionUID = 700220941755846541L;
    
    private Integer cardtypeid;
    
    private String cardname;
    
    private Integer parentid;
    
    private Date createdate;


    public Integer getCardtypeid() {
        return cardtypeid;
    }

    public void setCardtypeid(Integer cardtypeid) {
        this.cardtypeid = cardtypeid;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

}