package com.liangyi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@ComponentScan("com.liangyi")
@EnableWebMvc // 相当于给AdapterHandler配置了json转换器, 同时也配置了handlerMapping 和 handlerAdapter
public class MvcConfig {
//    @Bean
//    public RequestMappingHandlerMapping handlerMapping(){
//        return new RequestMappingHandlerMapping();
//    }
//
//    @Bean
//    public RequestMappingHandlerAdapter handlerAdapter(){
//        return new RequestMappingHandlerAdapter();
//    }
}
