package com.liangyi.controller;

import com.liangyi.mapper.UserMapper;
import com.liangyi.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserMapper userMapper;
    @GetMapping("user")
    @ResponseBody
    public User getUser(){
        String sql = "select user_id userId, user_name userName from user where user_id = ? ;";
        String id = "001";
        User user = jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<User>(User.class));
        System.out.println(user);
//        User user = new User();
//        user.setUserName("ly");
//        user.setUserId("002");
        return user;

    }

    @GetMapping("all")
    @ResponseBody
    public List<User> getAllUser(){
        List<User> users = userMapper.quaryUserAll();
        return users;
    }
    @GetMapping("updateUser")
    @ResponseBody
    @Transactional
    public List<User> updateUser(@RequestParam("userId") String userId, @RequestParam("userName") String userName){
        Boolean b = userMapper.updateUser(userId, userName);
        List<User> users = userMapper.quaryUserAll();
        System.out.println(users);
        double c = 1 / 0;
        return users;
    }
}
