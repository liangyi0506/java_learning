package com.liangyi;

import com.liangyi.entity.ResponseVOUtil;
import com.liangyi.entity.Student;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Response;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("1", "2", "3");
        Student student1 = new Student("1", "2", "3");
        Student student2 = new Student("1", "2", "3");
        Student student3 = new Student("1", "2", "3");
        System.out.println(ResponseVOUtil.success(student).getEntity());
        student = null;
        System.out.println(String.valueOf(student));
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(StringUtils.join(null));
        System.out.println(StringUtils.join(students));

    }
}
