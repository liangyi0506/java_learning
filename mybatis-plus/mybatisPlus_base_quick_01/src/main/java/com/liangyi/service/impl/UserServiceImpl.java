package com.liangyi.service.impl;

import com.liangyi.pojo.User;
import com.liangyi.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public boolean save(User user){
        return user.insertOrUpdate();
    }
}
