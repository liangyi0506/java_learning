package com.liangyi.service.impl;

import com.liangyi.Student;
import com.liangyi.dao.StudentDao;
import com.liangyi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> findAll() {
        return studentDao.quaryAll();
    }

    @Override
    public void updateNameById(String name, Integer id) {
        studentDao.updateNameById(name, id);
        System.out.println("service: update name by id");
    }

    @Override
    public void updateAgeById(Integer age, Integer id) {
        studentDao.updateAgeById(age, id);
        System.out.println("service: update age by id");
    }
}
