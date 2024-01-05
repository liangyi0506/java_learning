package com.liangyi.controller;

import com.liangyi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("user")
public class UserController {
    @Value("${say.hello.speak}")
    private String priStr;

    @Value("${user.userName}")
    private String userName;

    @Value("${user.userAge}")
    private Integer userAge;

    @Autowired
    private User user;
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<User> userList(){
        ArrayList<User> users = new ArrayList<>();
        users.add(user);

        return users;
    }

    @RequestMapping(value = "say", method = RequestMethod.GET)
    public String saySomething(){
        return userName + " " + userAge;
    }
}
