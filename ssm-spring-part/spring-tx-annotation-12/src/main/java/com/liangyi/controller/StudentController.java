package com.liangyi.controller;

import com.liangyi.Student;
import com.liangyi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Transactional(readOnly = true, timeout = 3)
    public List<Student> findAll() throws InterruptedException {
        List<Student> all = studentService.findAll();
        Thread.sleep(6000);
        System.out.println(all);
        return all;
    }

    public void updateNameById(String name, Integer id){
        studentService.updateNameById(name, id);
    }

    public void updateAgeById(Integer age, Integer id){
        studentService.updateAgeById(age, id);
    }

    @Transactional(timeout = 3) // 事务注解，说明下面的方法是一整个事务
    public void updateNameAndAge(String name, Integer age, Integer id) throws InterruptedException {
        // 这里因为是一个事务，那么在执行完updateAge之后因为1/0出错，你们updateAge就会回滚
        updateAgeById(age, id);
        System.out.println("更新年龄执行完毕");
        Thread.sleep(4000);
        updateNameById(name, id);
        System.out.println("更新姓名执行完毕");
    }

    @Transactional(noRollbackFor = IOException.class, rollbackFor = Exception.class)
    public void changeInfo() throws FileNotFoundException {
        updateNameById("Mike", 4);

        // 创造一个IO异常用来测试
        FileInputStream fileInputStream = new FileInputStream("123.txt");

    }
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void changeInfo2() throws FileNotFoundException {
        updateNameById("Mike", 4);

        // 创造一个IO异常用来测试
        FileInputStream fileInputStream = new FileInputStream("123.txt");

    }

    @Transactional(propagation = Propagation.REQUIRES_NEW) // 无论调用方法有无事务都作为一个独立事务
    public void changeName(){
        studentService.updateNameById("神里绫", 4);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW) // 调用方法有事务则加入，无事务则作为独立事务
    public void changeAge(){
        studentService.updateAgeById(1000, 4);
        int i = 1/0;
    }

//    @Transactional
    public void changeInfo3(){
        changeName();
        changeAge();

    }
}
