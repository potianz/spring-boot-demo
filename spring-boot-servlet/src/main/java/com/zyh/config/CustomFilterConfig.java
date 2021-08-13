package com.zyh.config;

import com.zyh.filter.CustomFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;

@Configuration
public class CustomFilterConfig {

    @Bean
    public FilterRegistrationBean<CustomFilter> filterFilterRegistrationBean (){
        FilterRegistrationBean<CustomFilter> filterFilterRegistrationBean =
                new FilterRegistrationBean<>();
//        将过滤器装入
        filterFilterRegistrationBean.setFilter(new CustomFilter());
//        设置过滤器路径
        filterFilterRegistrationBean.addUrlPatterns("/*");
//        设置过滤器的优先级   数字越小优先级越高
        filterFilterRegistrationBean.setOrder(0);
        return filterFilterRegistrationBean;
    }



}
