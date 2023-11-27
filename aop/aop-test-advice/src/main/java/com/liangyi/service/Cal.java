package com.liangyi.service;

import com.liangyi.annotation.TestAnnotation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface Cal {

    @TestAnnotation
    public void fun1() throws Exception;
}
