package com.liangyi.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    // 将设置到服务层、持久层的config类放在rootConfig中，这一步会帮我们完成SpringIoC容器的创建，而不需要我们再手动创建
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{DataSourceConfig.class, MapperConfigNew.class, ServiceConfig.class};
    }

    // 将设置SpringMVC的配置类放在ServletConfig中
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMvcConfig.class};
    }

    // 设置服务启动后访问api的根路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
