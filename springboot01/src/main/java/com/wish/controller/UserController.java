package com.wish.controller;

import com.wish.entity.Fly;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Slf4j
@RestController
public class UserController {

    private final List<Fly> flyObjects;

    private final Map<String,Fly> flyMap;

    public UserController(List<Fly> flyObjects, Map<String,Fly> flyMap) {
        this.flyObjects = flyObjects;
        this.flyMap = flyMap;
    }

    //方式一：通过自动注入方式获取request
    @Autowired
    private HttpServletRequest request;

    @GetMapping("/hello2")
    public String getUser(){
        return "get success!";
    }

    @GetMapping("/request/test01")
    public String test01(){
        String name = request.getHeader("name");
        log.info("name:" + name);
        return name;
    }


    //方式二：通过接口传参的方式，获取request
    @GetMapping("/request/test02")
    public String test02(HttpServletRequest requestParameter){
        String name = request.getHeader("name");
        String name02 = requestParameter.getHeader("name");
        log.info("name:" + name + ",nameP:" + name02);
        return name + ":" + name02;
    }

    //方式二：通过内置工具类，获取request
    @GetMapping("/request/test03")
    public String test03(){

        for(Fly obj: flyObjects){
            obj.fly();
        }

        log.info("------------");

        Set<String> keySet = flyMap.keySet();
        for(String key : keySet){
            Fly fly = flyMap.get(key);
            log.info("name:{}" + key);
            fly.fly();
        }

        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String name = req.getHeader("name");
        log.info("name:" + name);
        return name;
    }
}
