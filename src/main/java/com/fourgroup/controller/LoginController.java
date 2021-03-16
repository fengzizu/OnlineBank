package com.fourgroup.controller;

import com.fourgroup.biz.UserBiz;
import com.fourgroup.pojo.Obuser;
import com.fourgroup.pojo.User;
import com.fourgroup.service.ObuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @Autowired
    private UserBiz userBiz;

    @Autowired
    private ObuserService obuserService;

    @PostMapping("/login")
    public User login1(HttpServletRequest request, @RequestBody User user) {
        System.out.println(user.getUname());

        System.out.println(user.getUpassword());
        if (userBiz.findUser(user) != null) {
            return user;
        } else {
            return null;
        }

    }

    @PostMapping("/login1")
    public Obuser login(HttpServletRequest request, @RequestBody Obuser obuser) {
        obuser = obuserService.login(obuser);
        HttpSession session = request.getSession();


        if (obuser != null) {
            String obuserid = obuser.getObuserid();
            session.setAttribute("obuserid", obuserid);
            String username = (String) session.getAttribute("obuserid");
            return obuser;
        } else {
            return null;
        }

    }

}
