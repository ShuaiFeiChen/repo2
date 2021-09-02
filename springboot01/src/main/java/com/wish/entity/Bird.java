package com.wish.entity;

import org.springframework.stereotype.Component;

@Component
public class Bird implements Fly{
    @Override
    public void fly() {
        System.out.println("bird fly");
    }
}
