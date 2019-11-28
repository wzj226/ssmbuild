package com.gao.controller;

import com.gao.pojo.User;
import com.gao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/tologin")
    public String tologin() {
        return "login";
    }

    @RequestMapping("/user/login")
    public String loginUser(User user) {
        System.out.println(user);
        boolean flag = userService.loginUser(user);
        if (flag) {
            return "redirect:/book/allBook";
        }
        return "failure";
    }

    @RequestMapping("/user/toregister")
    public String toregister() {
        return "register";
    }

    @RequestMapping("/user/register")
    public String registerUser(User user) {
        userService.registerUser(user);
        return "login";
    }
}
