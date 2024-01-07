package com.liangyi.controller;

import com.liangyi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import com.liangyi.pojo.User;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/all")
    @ResponseBody
    public List<User> getAllUsers(){
        List<User> users = userMapper.selectList(null);
        return users;
    }
}
