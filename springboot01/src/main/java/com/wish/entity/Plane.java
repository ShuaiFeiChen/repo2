package com.wish.entity;

import org.springframework.stereotype.Component;

@Component
public class Plane implements Fly{
    @Override
    public void fly() {
        System.out.println("Plane fly");
    }
}
