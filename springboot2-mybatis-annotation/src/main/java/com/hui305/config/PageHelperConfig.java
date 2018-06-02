package com.hui305.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by hui_stone on 2018/5/14 0014.
 */
//@Configuration
public class PageHelperConfig {

    //配置mybatis的分页插件pageHelper
//    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }
//    @Value("${pagehelper.helperDialect}")
//    private String helperDialect;
//
//    @Bean
//    public PageInterceptor pageInterceptor(){
//        PageInterceptor pageInterceptor = new PageInterceptor();
//        Properties properties = new Properties();
//        properties.setProperty("helperDialect", helperDialect);
//        pageInterceptor.setProperties(properties);
//        return pageInterceptor;
//    }
}
