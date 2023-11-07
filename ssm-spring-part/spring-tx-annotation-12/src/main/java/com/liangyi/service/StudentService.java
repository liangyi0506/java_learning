package com.liangyi.service;

import com.liangyi.Student;

import java.util.List;

public interface StudentService {

    /**
     * 查询所有学生的
     */
    List<Student> findAll();

    /**
     * 根据id修改name
     */
    void updateNameById(String name, Integer id);

    /**
     * 根据id修改age
     */
    void updateAgeById(Integer age, Integer id);

}
