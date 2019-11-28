package com.gao.service;

import com.gao.pojo.User;

public interface UserService {
    //注册一个用户
    int registerUser(User user);

    //登录一个用户
    boolean loginUser(User user);
}
