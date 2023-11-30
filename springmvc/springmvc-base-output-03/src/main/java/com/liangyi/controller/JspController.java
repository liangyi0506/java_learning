package com.liangyi.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jsp")
public class JspController {

    // 直接定稳jsp,那么定义的路径无所谓，只需要return 正确的地址即可
    @RequestMapping("index") // 这里绝对不能加@ResponseBody（因为@ResponseBody是代表直接将return的值返回给浏览器，不经过jsp）
    public String getData(HttpServletRequest request){
        request.setAttribute("resData", "hello,SpringMVC&&JSP");
        return "/index"; // 这个index要和controller中配置的前缀和后缀组成想要返回的jsp文件的完整路径, 所以返回值必须为String类型
    }

    // 转发和重定向在写路径的时候都不需要写根目录的地址，springMVC会帮你自动补齐
    // 转发
    // 转发只能转发当前项目下的路径
    @RequestMapping("forward")
    public String getForward(){
        return "forward:/jsp/index"; // 在路径前面加 forward:就是代表要转发
    }

    // 重定向
    // 重定向可以转发到任意资源
    // 转发其他项目的地址要写完整的地址
    @RequestMapping("redirect")
    public String getRedirect(){
        return "redirect:/jsp/index"; // 加redirect:就是代表要重定向
    }

    @RequestMapping("redirect/baidu")
    public String getRedirectBaidu(){
        return "redirect:http://www.baidu.com"; // 加redirect:就是代表要重定向, 注意前面的http不能省略
    }


}
