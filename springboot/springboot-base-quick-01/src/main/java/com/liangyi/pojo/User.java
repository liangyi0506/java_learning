package com.liangyi.pojo;

import lombok.Data;

@Data
public class User {
    private String userName;
    private Integer userAge;
    private String gender;

    public User(String userName, Integer userAge, String gender){
        this.userAge = userAge;
        this.userName = userName;
        this.gender = gender;
    }
}
