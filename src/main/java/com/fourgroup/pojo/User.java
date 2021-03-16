package com.fourgroup.pojo;

public class User {
    public Integer uid;
    public String username;
    public String upassword;
    public String uname;
    public User() {

    }

    public User(Integer uid, String username, String upassword, String uname) {
        this.uid = uid;
        this.username = username;
        this.upassword = upassword;
        this.uname = uname;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
