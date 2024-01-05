package com.liangyi.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "user")
public class User {
    private String userName;
    private Integer userAge;
    private String gender;
    private List<String> hobbies;

}
