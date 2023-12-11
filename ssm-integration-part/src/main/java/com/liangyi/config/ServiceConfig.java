package com.liangyi.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

/**
 * 1. service
 * 2. 开启aop注解的支持
 * 3. tx声明式事务管理
 */
@Configuration
@EnableAspectJAutoProxy // 开启aop注解的支持
@EnableTransactionManagement // 开启事务管理器支持: 1. 对应的事务管理器实现[TransactionManager DataSourceManager Hibernate jpa]
public class ServiceConfig {



    // 我们这里使用了DataSourceTransactionManager来实现事务管理支持
    @Bean
    public TransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws IOException {
//
//        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        return sqlSessionFactory;
//
//    }


}
