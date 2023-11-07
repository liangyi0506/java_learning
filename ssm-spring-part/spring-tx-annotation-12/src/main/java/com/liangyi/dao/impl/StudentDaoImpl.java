package com.liangyi.dao.impl;

import com.liangyi.Student;
import com.liangyi.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> quaryAll(){
        String sql = "select * from studb.students";
        List<Student> studtns = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        System.out.println("students=" + studtns);
        return studtns;
    }

    @Override
    public void updateNameById(String name, Integer id){
        String sql = "update studb.students set name = ? where id = ? ";
        int label = jdbcTemplate.update(sql, name, id);
        System.out.println("update name : " + (label == 1));
    }

    @Override
    public void updateAgeById(Integer age, Integer id){
        String sql = "update studb.students set age = ? where  id = ?";
        int label = jdbcTemplate.update(sql, age, id);
        System.out.println("update age : " + (label == 1));
    }

}
