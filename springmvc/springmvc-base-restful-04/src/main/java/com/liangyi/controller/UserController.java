package com.liangyi.controller;

import com.github.pagehelper.PageInfo;
import com.liangyi.pojo.User;
import com.liangyi.service.UserService;
import jakarta.ws.rs.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("user")
@ResponseBody // 直接返回请求的数据
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "user", method = RequestMethod.GET)
//    @GET
    public User searchUserById(@RequestParam("userId") String userId){
        return userService.searchUserById(userId);
    }

    @RequestMapping(value = "user", method = RequestMethod.DELETE)
    public Boolean deleteUserById(@RequestParam("userId") String userId){
        return userService.deleteUserById(userId);
    }

    @RequestMapping(value = "user", method = RequestMethod.POST)
    public Boolean addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public Boolean updateUserById(String userId, String userName){
        return userService.updateUserById(userId, userName);
    }

    @RequestMapping(value = "userPage", method = RequestMethod.GET)
    public PageInfo<User> searchUserPage(Integer pageNum, Integer pageSize){
        return userService.searchUserPage(pageNum, pageSize);
    }
}
