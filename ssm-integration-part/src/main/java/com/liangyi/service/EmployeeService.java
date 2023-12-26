package com.liangyi.service;

import com.liangyi.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    /**
     * 查询所有的接口
     * @return
     */
    List<Employee> getEmpList();
}
