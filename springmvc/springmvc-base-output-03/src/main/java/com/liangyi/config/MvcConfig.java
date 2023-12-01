package com.liangyi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.liangyi")
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
    // 视图解析器ViewResolver
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // 规定寻找jsp文件的前后缀
        // 前缀：将webapp作为根目录，填写路径
        // 后缀：.jsp
        // 总之就是通过前面的路径和后面的后缀，在controller层能找到即可
        registry.jsp("/WEB-INF/view", ".jsp");
    }


    // 开启静态资源访问
    // 直接输入webapp下的静态资源即可，例如访问redpig.jpg 只需要输入/image/redpig.jpg
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
