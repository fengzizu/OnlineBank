package com.fourgroup.interceptor;


import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * description:
 * author:cb
 * datetime:2019年7月28日  下午6:05:42
 */
@Component
public class UserLoginInterceptor implements HandlerInterceptor {

    protected org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {

        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("obuserid");
        System.out.println(username);
        if (null != username) {//已登录
            return true;
        } else {//未登录
            //直接重定向到登录页面
            response.sendRedirect(request.getContextPath() + "/login.html");
            return false;
        }
    }

}