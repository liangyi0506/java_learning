package com.liangyi.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * SpringMVC和Controller相关的设置:
 *  1. 创建HandlerAdapter和HandlerMapping相关的bean
 *  2. 设置controller
 *  3. 设置全局异常处理器
 *  4. 静态资源拿出
 *  5. json转化器
 *  6. 拦截器
 *  7. jsp的前缀和后缀
 */
@Configuration
@EnableWebMvc // 可以配置上面注解中的1. 5.
@ComponentScan({"com.liangyi.controller", "com.liangyi.exceptionhandler"}) // 配置2. 3.
public class WebMvcConfig implements WebMvcConfigurer {
    // 配置4.
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    // 配置7.
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", "jsp");
    }

    // 配置6.

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor()
    }
}
