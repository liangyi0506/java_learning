package com.liangyi.test;

import com.liangyi.mapper.EmployeeMapper;
import com.liangyi.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void test01() throws IOException {
        // 1. 读取配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        // 2. 创建SqlSessionfactory类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 3. 开启一个session
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4. 读取mapper 文件
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        // 5. 执行语句
        Employee employee = new Employee();
        List<Employee> employeeList = mapper.findByParams(employee);

        System.out.println("____________\n" + employeeList);

        sqlSession.commit();
        sqlSession.close();

    }

}
