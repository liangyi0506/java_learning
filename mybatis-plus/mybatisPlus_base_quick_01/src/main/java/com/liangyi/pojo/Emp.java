package com.liangyi.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Emp {
    @TableId
    Integer empId;

    String empName;

    Double empSalary;
}
