package com.liangyi.mapper;

import com.github.pagehelper.Page;
import com.liangyi.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserMapper {

    // 根据Id查询user
    public User searchUserById(String userId);
    // 根据id删除user
    public Boolean deleteUserById(String userId);
    // 增加一个user
    public Boolean addUser(@Param("form") User user);
    // 根据id修改user
    public Boolean updateUserById(@Param("userId") String userId, @Param("userName") String userName);
    // 批量分页查询user
    public List<User> searchUserPage();
}
