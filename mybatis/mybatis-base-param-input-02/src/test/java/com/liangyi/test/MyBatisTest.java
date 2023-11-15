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

public class MyBatisTest {

    @Test
    public void testMybatis01() throws IOException{
        // 1. 读取配置文件
        String configFilePath = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(configFilePath);

        // 2. 创建SqlSessionFactory类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 3. 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4. 读取mapper
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        // 5. 执行sql命令
        Employee employee = mapper.findById(1);
        Employee employee1 = mapper.findByIdAndName(2, "Jerry");

        // 6. 展示查询
        System.out.println(employee);

        // 7. 提交查询
        sqlSession.commit();

        // 8. 关闭Session
        sqlSession.close();

    }

    @Test
    public void testMybatis02() throws IOException{
        // 1. 读取配置文件
        String configFilePath = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(configFilePath);

        // 2. 创建SqlSessionFactory类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 3. 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4. 读取mapper
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        // 5. 执行sql命令
        int label = mapper.deleteById(1);

        // 6. 展示查询
        System.out.println(label);

        // 7. 提交查询
        sqlSession.commit();

        // 8. 关闭Session
        sqlSession.close();

    }

    @Test
    public void testMybatis03() throws IOException{
        // 1. 读取配置文件
        String configFilePath = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(configFilePath);

        // 2. 创建SqlSessionFactory类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 3. 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4. 读取mapper
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        // 5. 执行sql插入命令
        Employee employee = new Employee();
        employee.setEmpName("黄鼠狼");
        employee.setEmpSalary(9999.0);
        int label = mapper.insertEmployee(employee);

        // 6. 展示查询
        System.out.println(label);

        // 7. 提交查询
        sqlSession.commit();

        // 8. 关闭Session
        sqlSession.close();

    }
}
