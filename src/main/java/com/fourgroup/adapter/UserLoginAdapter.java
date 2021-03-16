package com.fourgroup.adapter;


import com.fourgroup.interceptor.UserLoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@SpringBootApplication
@EnableCaching
public class UserLoginAdapter implements WebMvcConfigurer {

    @Autowired
    private UserLoginInterceptor userLoginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //添加对用户是否登录的拦截器，并添加过滤项、排除项
        registry.addInterceptor(userLoginInterceptor).addPathPatterns("/**")
                .excludePathPatterns("/css/**", "/js/**", "/img/**", "/fonts/**")//排除样式、脚本、图片等资源文件
                .excludePathPatterns("/login.html")//排除登录页面
                .excludePathPatterns("/login1");


    }

}