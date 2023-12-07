package com.liangyi.config;

import com.liangyi.interceptor.MyInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.liangyi")
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    // 添加拦截路径


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 1. 拦截全部请求
//        registry.addInterceptor(new MyInterceptor());

        // 2. 拦截指定路径
        // /user/* 任意一层路径
        // /user/** 任意多层路径
//        registry.addInterceptor(new MyInterceptor())
//                .addPathPatterns("/user/data");

        // 3. 排除拦截 拦截的地址应该在已经被拦截的地址内部
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/user/**").excludePathPatterns("/user/data");
        
    }
}
