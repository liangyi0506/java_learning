package com.liangyi.service.impl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liangyi.mapper.UserMapper;
import com.liangyi.pojo.User;
import com.liangyi.service.UserService;
import jakarta.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public User searchUserById(String userId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.searchUserById(userId);
        sqlSession.commit();
        sqlSession.close();
        return user;
    }

    @Override
    public Boolean deleteUserById(String userId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Boolean deleted = mapper.deleteUserById(userId);
        sqlSession.commit();
        sqlSession.close();
        return deleted;
    }

    @Override
    public Boolean addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Boolean addUser = mapper.addUser(user);
        sqlSession.commit();
        sqlSession.close();
        return addUser;
    }

    @Override
    public Boolean updateUserById(String userId, String userName) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Boolean updateUserById = mapper.updateUserById(userId, userName);
        sqlSession.commit();
        sqlSession.close();
        return updateUserById;
    }

    @Override
    public PageInfo<User> searchUserPage(Integer pageNum, Integer pageSize) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.searchUserPage();
        sqlSession.commit();
        sqlSession.close();

        PageHelper.startPage(pageNum, pageSize);
        PageInfo<User> page = new PageInfo<>(users);
        return page;
    }
}
