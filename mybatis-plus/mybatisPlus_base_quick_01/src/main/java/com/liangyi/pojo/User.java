package com.liangyi.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class User extends Model<User> {
    @TableId
    String userId;
    String userName;
    Integer userAge;
    String gender;
}
