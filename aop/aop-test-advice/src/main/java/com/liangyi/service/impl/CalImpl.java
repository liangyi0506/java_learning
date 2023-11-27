package com.liangyi.service.impl;

import com.liangyi.annotation.TestAnnotation;
import com.liangyi.service.Cal;
import org.springframework.stereotype.Service;

@Service
public class CalImpl implements Cal {
    @Override
    @TestAnnotation
    public void fun1() throws Exception {
        System.out.println("fun1");
        throw new Exception("throw new Exception");
    }
}
