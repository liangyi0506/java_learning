package com.liangyi.pojo;

import lombok.Data;

@Data
public class User {
    String name;
    String age;
    String gender;

    public User(String name, String age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
