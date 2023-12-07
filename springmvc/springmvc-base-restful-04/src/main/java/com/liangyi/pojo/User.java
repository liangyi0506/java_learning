package com.liangyi.pojo;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String userName;

    public User(){

    }
    public User(String userId, String userName){
        this.userId = userId;
        this.userName = userName;
    }
}
