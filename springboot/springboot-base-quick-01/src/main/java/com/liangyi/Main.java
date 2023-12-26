package com.liangyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------Application begin to start------------------------------------");
        SpringApplication.run(Main.class, args);
        System.out.println("------------------------------------Application has started------------------------------------");
    }
}