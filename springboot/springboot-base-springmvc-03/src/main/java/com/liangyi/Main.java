package com.liangyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liangyi.mapper") // 指定mapper接所在的位置
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------Application has begun to start------------------------------------");
        SpringApplication.run(Main.class, args);
        System.out.println("------------------------------------Application has succeed to start------------------------------------");

    }
}
