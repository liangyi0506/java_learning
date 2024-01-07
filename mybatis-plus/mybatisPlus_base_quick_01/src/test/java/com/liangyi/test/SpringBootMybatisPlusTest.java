package com.liangyi.test;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liangyi.mapper.UserMapper;
import com.liangyi.pojo.Emp;
import com.liangyi.pojo.User;
import com.liangyi.service.IEmpService;
import com.liangyi.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SpringBootMybatisPlusTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private IUserService userService;
    @Autowired
    private IEmpService empService;
    @Test
    public void test(){
        Page<User> page = new Page<>(1, 3);
        IPage<User> userIPage = userMapper.selectPageUserVo(page, 30);

        System.out.println(userIPage.getRecords());

    }
}
