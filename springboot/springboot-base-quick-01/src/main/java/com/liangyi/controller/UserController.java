package com.liangyi.controller;

import com.liangyi.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<User> userList(){
        User user = new User("liangyi", 25, "male");
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }
}
