package com.liangyi;

import com.liangyi.config.JavaConfig;
import com.liangyi.controller.StudentController;
import com.liangyi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

@SpringJUnitConfig(JavaConfig.class)
public class SpringTxTest {
    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentController studentController;
    @Test
    public void test() throws FileNotFoundException {
        studentController.changeInfo3();
    }
}
