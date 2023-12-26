package com.liangyi.mapper;

import com.liangyi.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    // 查询所有的职员信息
    List<Employee> getEmpList();
}
