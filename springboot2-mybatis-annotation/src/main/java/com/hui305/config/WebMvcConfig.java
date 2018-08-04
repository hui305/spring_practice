package com.hui305.config;

import com.hui305.intercepter.TicketIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by hui_stone on 2018/6/2 0002.
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private TicketIntercepter ticketIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
            registry.addInterceptor(ticketIntercepter).addPathPatterns("/**");

        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用于排除拦截
//        registry.addInterceptor(SpringContextHolder.getBean(TicketIntercepter.class)).addPathPatterns("/**");
//        super.addInterceptors(registry);
    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/index");
        registry.addViewController("/index").setViewName("/index");
        registry.addViewController("/websocket").setViewName("/websocket");
    }
}

