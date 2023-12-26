package com.liangyi.service.impl;

import com.liangyi.mapper.EmployeeMapper;
import com.liangyi.pojo.Employee;
import com.liangyi.service.EmployeeService;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getEmpList() {
        return employeeMapper.getEmpList();
    }
}
