package com.liangyi.dao;

import com.liangyi.Student;

import java.util.List;

public interface StudentDao {


    /*
        查询全部学生
     */
    List<Student> quaryAll();

    /*
        根据id修改name
     */
    void updateNameById(String name, Integer id);

    /*
        根据id修改age
     */
    void updateAgeById(Integer age, Integer id);

}
