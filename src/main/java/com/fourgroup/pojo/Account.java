package com.fourgroup.pojo;
//对应数据库中的类型返回值
public class Account {
    public String accountid;
    public String accountname;
    public String accountbranch;

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getAccountbranch() {
        return accountbranch;
    }

    public void setAccountbranch(String accountbranch) {
        this.accountbranch = accountbranch;
    }
}
