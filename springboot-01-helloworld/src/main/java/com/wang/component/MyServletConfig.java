package com.wang.component;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyServletConfig {

//    //注册servlet三大组件（Servlet、Filter、Listener）
//    @Bean
//    public ServletRegistrationBean registrationBean(){
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet(), "/myserv");
//        return  registrationBean;
//    }
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean(){
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new MyFilter());
//        filterRegistrationBean.setUrlPatterns(Arrays.asList("/myserv"));
//        return  filterRegistrationBean;
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
//        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean(new MyListene());
//        return  servletListenerRegistrationBean;
//    }
}
