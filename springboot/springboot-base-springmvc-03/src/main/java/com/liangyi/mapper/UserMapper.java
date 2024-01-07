package com.liangyi.mapper;

import com.liangyi.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> quaryUserAll();

    Boolean updateUser(@Param("userId") String userId, @Param("userName") String userName);
}
