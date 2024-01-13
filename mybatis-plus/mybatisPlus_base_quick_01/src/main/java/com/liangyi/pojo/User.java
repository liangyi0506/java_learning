package com.liangyi.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
@TableName("user")
public class User extends Model<User> {
    @TableId
    String userId;

    String userName;

    Integer userAge;

    String gender;

//    @TableLogic(value = "0" ,delval = "1") // 设置默认值为“0”表示未删除，“1”表示已删除，但其实改字段默认值也只这样
    String deleted;

    @Version
    Integer version;
}

