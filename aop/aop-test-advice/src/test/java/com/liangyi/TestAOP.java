package com.liangyi;

import com.liangyi.config.IoCConfig;
import com.liangyi.pojo.Student;
import com.liangyi.service.Cal;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@SpringJUnitConfig(IoCConfig.class)
public class TestAOP {
    @Autowired
    private Cal cal;

    @Test
    public void test() throws Exception {
        cal.fun1();
    }

    @Test
    public void say(){
        Student stu1 = new Student("Mike1", "123", "101");
        Student stu2 = new Student("Mike2", "123", "101");
        Student stu3 = new Student("Mike3", "123", "101");
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);

        System.out.println(StringUtils.join(studentList, ",\n"));

    }
}
