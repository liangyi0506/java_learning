package com.liangyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liangyi.mapper.EmpMapper;
import com.liangyi.pojo.Emp;
import com.liangyi.service.IEmpService;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService{
}
