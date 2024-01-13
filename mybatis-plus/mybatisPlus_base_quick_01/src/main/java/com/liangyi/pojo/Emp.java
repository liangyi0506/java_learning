package com.liangyi.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("emp")
public class Emp {
    @TableId
    Integer empId;

    String empName;

    Double empSalary;
}
