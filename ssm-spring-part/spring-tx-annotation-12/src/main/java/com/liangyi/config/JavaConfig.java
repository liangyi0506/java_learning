package com.liangyi.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.liangyi")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement // 开启事务注解的支持
//@EnableAspectJAutoProxy // 开启切面注解的的支持
public class JavaConfig {

    @Bean
    public DataSource dataSource(
            @Value("${studb.driver}") String className,
            @Value("${studb.url}") String url,
            @Value("${studb.username}") String userName,
            @Value("${studb.password}") String password
    ){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(className);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
    public TransactionManager transactionManager(DataSource dataSource){
        // 根据连接池创建事务管理器
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        // 指定数据库连接池
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }


}
