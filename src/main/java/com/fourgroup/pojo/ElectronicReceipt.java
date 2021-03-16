package com.fourgroup.pojo;

public class ElectronicReceipt {
    //对应数据库中的类型返回值
    public String eletronicId;
    public String giveaccount;
    public String acceptaccount;
    public double money;
    public String uses;
    public String remark;
    public String voucher;

    public String getGiveaccount() {
        return giveaccount;
    }

    public void setGiveaccount(String giveaccount) {
        this.giveaccount = giveaccount;
    }

    public String getAcceptaccount() {
        return acceptaccount;
    }

    public void setAcceptaccount(String acceptaccount) {
        this.acceptaccount = acceptaccount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getEletronicId() {
        return eletronicId;
    }

    public void setEletronicId(String eletronicId) {
        this.eletronicId = eletronicId;
    }
}
