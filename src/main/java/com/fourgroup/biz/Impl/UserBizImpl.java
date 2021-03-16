package com.fourgroup.biz.Impl;

import com.fourgroup.biz.UserBiz;
import com.fourgroup.dao.UserDao;
import com.fourgroup.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserBizImpl implements UserBiz {
    @Autowired
    UserDao userDao;
    @Override
    public User findUser(User user) {
    return userDao.findUser(user);
    }
}
