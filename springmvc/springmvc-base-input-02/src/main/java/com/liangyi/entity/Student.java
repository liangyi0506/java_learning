package com.liangyi.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.web.bind.annotation.RequestParam;

@Data
@ToString(exclude = "stuClass")
public class Student {
    String stuName;
    String stuID;
    String stuClass;

    public Student(String stuName, String stuID, String stuClass){
        this.stuName = stuName;
        this.stuID = stuID;
        this.stuClass = stuClass;
    }

    @Override
    public String toString(){
        return "{" + "stuName:" + this.stuName + ", stuID:" + this.stuID + ", stuClass:" + this.stuClass + "}";
    }
}
