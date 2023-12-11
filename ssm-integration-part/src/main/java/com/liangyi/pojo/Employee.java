package com.liangyi.pojo;

import lombok.Data;

@Data
public class Employee {
    private Integer empId;
    private String empName;
    private Double empSalary;


    public Employee(){

    }
    public Employee(Integer empId, String empName, Double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

}
