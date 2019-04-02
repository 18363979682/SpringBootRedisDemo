package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

/**
 * Created by user on 2019/4/2.
 */
public class UserService {

    @Autowired
    UserDao userDao;

    @Cacheable(value = "redisCache", key = "'redis_user_'+#userId")
    public User getUser(String userId) {
        return userDao.getUser(userId);
    }
}
