package com.liangyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.liangyi.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    /**
     * 返回 userAge > 给定age值的数据
     * @param page
     * @param age
     * @return
     */
    IPage<User> selectPageUserVo(IPage<?> page, @Param("userAge") Integer age);
}
