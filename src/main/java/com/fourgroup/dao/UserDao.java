package com.fourgroup.dao;

import com.fourgroup.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    public User findUser(User user);
}
