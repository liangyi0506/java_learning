package com.liangyi;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.liangyi.mapper")
public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------starting---------------------------------");
        SpringApplication.run(Main.class, args);
        System.out.println("---------------------------------started---------------------------------");
    }

    // 加入分页查询的插件
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL)); // 实现分页查询的拦截器
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor()); // 实现乐观锁的拦截器
        interceptor.addInnerInterceptor(new BlockAttackInnerInterceptor()); // 防止全表更新删除的拦截器
        return interceptor;
    }
}