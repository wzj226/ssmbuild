package com.gao.service.Impl;

import com.gao.dao.UserDao;
import com.gao.pojo.User;
import com.gao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public int registerUser(User user) {
        return userDao.addUser(user);
    }

    public boolean loginUser(User user) {
        User user1 = userDao.queryById(user.getUsername(),user.getPassword());

        if (user1 == null) {
            return false;
        }
        return true;
    }
}
