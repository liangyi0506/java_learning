package com.liangyi.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {
    // 在jdk1.8 之后HandlerInterceptor中的方法默认已经实现

    /**
     *
     * @param request 请求对象
     * @param response 响应对象
     * @param handler 我们要调用的方法对象
     * @return true 拦截 false 放行
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("request: " + request + "\nresponse: " + response + "\nhandler: " + handler);
        return true;
    }

    /**
     * 当handler执行完毕之后触发的方法,没有拦截机制了
     * 此方法只有preHandle 的return为true的时候才会触发
     * function: 1. 对结果处理 2. 对敏感词汇检查
     * @param request 请求对象
     * @param response 响应对象
     * @param handler 我们要调用的方法对象
     * @param modelAndView 返回的试图和共享域对象
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("request: " + request + "\nresponse: " + response + "\nhandler: " + handler);
    }

    /**
     * 整体处理完毕之后
     *
     * @param request
     * @param response
     * @param handler
     * @param ex handler报错了生成的异常对象
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
