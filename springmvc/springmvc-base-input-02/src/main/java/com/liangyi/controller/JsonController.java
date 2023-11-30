package com.liangyi.controller;

import com.liangyi.entity.Student;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RequestMapping("json")
@Controller
@ResponseBody
// springMVC默认只支持params的数据传输,所以需要导入依赖
public class JsonController {

    @PostMapping("student")
    public String returnStu(@RequestBody Student student){

        System.out.println(student);
        return student.toString();
    }
}
