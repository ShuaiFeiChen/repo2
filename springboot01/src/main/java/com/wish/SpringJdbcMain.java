package com.wish;

import com.wish.entity.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbcMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringJdbcMain.class, args);
    }
}
