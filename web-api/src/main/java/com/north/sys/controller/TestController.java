package com.north.sys.controller;

import com.north.sys.service.Webapi2Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private Webapi2Service service;

    @RequestMapping("test")
    public String test(String s ){
        s+=service.hello("ss");
        System.out.println(service.hello("ss"));
        System.out.println(service.bye());
        s+=service.bye();
        return s;
    }
    @RequestMapping("abc")
    public String test2(String s ){
        return s==null?"b":s;
    }
}
