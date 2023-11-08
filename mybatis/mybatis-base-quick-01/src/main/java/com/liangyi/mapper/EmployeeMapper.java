package com.liangyi.mapper;

import com.liangyi.pojo.Employee;

public interface EmployeeMapper {

    // 根据id 查询职员
    Employee findById(Integer empId);

    // 根据Id删除职员
    int deleteById(Integer empId);


}
