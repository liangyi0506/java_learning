package com.liangyi.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
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
