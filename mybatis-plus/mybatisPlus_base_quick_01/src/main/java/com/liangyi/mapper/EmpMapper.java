package com.liangyi.mapper;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liangyi.pojo.Emp;

public interface EmpMapper extends BaseMapper<Emp> {

    List<Emp> select();
}
