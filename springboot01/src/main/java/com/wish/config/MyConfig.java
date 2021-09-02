package com.wish.config;

import com.wish.entity.Book;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextListener;

@Configuration
public class MyConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public Book book1(){
        return new Book("java",13.0f);
    }

    @Bean
    public Book book2(){
        return new Book("js",14.0f);
    }

//    @Bean
//    public ServletListenerRegistrationBean myLisenter(){
//        RequestContextListener requestContextListener = new RequestContextListener();
//        ServletListenerRegistrationBean<RequestContextListener> registrationBean = new ServletListenerRegistrationBean<>();
//        registrationBean.setListener(requestContextListener);
//        return registrationBean;
//    }

}
