package com.liangyi.mapper;

import com.liangyi.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {

    // 根据id 查询职员
    Employee findById(Integer empId);

    // 根据Id删除职员
    int deleteById(Integer empId);

    // 插入一个职员
    int insertEmployee(Employee employee);

    // 根据id和name查询一个Employee
    Employee findByIdAndName(@Param("id") Integer empId, @Param("name") String empName);

    // 询工资最高的员工的姓名和工资,以及部门的平均工资
    Map<String , Object> selectEmpNameAndMaxSalary();

    // 依据查询条件查询职员
    List<Employee> findByParams(@Param("form") Employee employee);
}
