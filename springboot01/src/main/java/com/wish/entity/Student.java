package com.wish.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {
    @Value("csf")
    private String name;
    @Value("15")
    private Integer age;
    @Value("henan")
    private String address;
    @Autowired
    @Qualifier(value = "book2")
    private Book book;

}
