package com.liangyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("springmvc/hello")
    @ResponseBody // 直接返回字符串给前端而不找视图层
    public String hello(){
        return "HelloController";
    }
}
