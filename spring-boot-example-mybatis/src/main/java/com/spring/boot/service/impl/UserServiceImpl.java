package com.spring.boot.service.impl;

import com.spring.boot.mapper.UserMapper;
import com.spring.boot.po.User;
import com.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper  userMapper;

    @Override
    public User queryById(int id) {
        return userMapper.queryById(id);
    }
}
