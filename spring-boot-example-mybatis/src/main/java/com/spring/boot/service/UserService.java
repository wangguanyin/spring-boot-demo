package com.spring.boot.service;

import com.spring.boot.po.User;

public interface UserService {
    User queryById(int id);
}
