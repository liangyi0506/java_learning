package com.liangyi.test;

import com.liangyi.mapper.EmployeeMapper;
import com.liangyi.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    @Test
    public void MybatisFindTest() throws IOException{
        // 1. 创建SqlSessionFactory对象

        // 1.1 声明mybatis-config.xml的路径
        String mybatisConfigFilePath = "mybatis-config.xml";
        // 1.2 以输入流的形式配置mybatis配置文件
        InputStream inputStream = Resources.getResourceAsStream(mybatisConfigFilePath);
        // 1.3 基于mybatis配置文件创建factory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. 使用SqlSessionFactory开启一个会话
        SqlSession session = factory.openSession();

        // 3. 根据EmployeeMapper接口的class对象获取Mapper接口类型的对象
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Employee employee = employeeMapper.findById(3);

        System.out.println("employee = " + employee);

        session.commit();
        session.close();


    }
}
