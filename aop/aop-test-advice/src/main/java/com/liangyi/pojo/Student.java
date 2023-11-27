package com.liangyi.pojo;

import lombok.Data;

@Data
public class Student {
    String stuName;
    String stuId;
    String stuClassName;

    public Student(String stuName, String stuId, String stuClassName) {
        this.stuName = stuName;
        this.stuId = stuId;
        this.stuClassName = stuClassName;
    }
}
