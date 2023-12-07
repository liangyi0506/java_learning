package com.liangyi.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.liangyi.pojo.User;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserService {
    public User searchUserById(String userId);
    public Boolean deleteUserById(String userId);
    // 增加一个user
    public Boolean addUser(User user);
    // 根据id修改user
    public Boolean updateUserById(String userId, String userName);
    // 批量分页查询user
    public PageInfo<User> searchUserPage(Integer pageNum, Integer pageSize);
}
