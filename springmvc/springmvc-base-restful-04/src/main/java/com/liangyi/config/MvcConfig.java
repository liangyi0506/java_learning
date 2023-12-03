package com.liangyi.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;
import java.io.InputStream;

@Configuration
@EnableWebMvc // 无需在使用HandlerAdapter和HandlerMapping
@ComponentScan("com.liangyi")
public class MvcConfig {

    private String mybatisConfigPath = "mybatis-config.xml";
    @Bean
    // 获取mybatis工厂组建
    public SqlSessionFactory sqlSessionFactory() throws IOException {
        // 1. 读取配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream(mybatisConfigPath);

        // 2. 创建SqlSession工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        return sqlSessionFactory;
    }

}
