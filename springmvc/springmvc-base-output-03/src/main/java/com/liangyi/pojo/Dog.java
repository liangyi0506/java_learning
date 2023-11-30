package com.liangyi.pojo;

import lombok.Data;

@Data
public class Dog {
    private String name;
    private Integer age;
    private String color;

    public Dog(String name, Integer age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

}
