package com.north.sys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("helloFeign")
    public String test(String s ){
        return s==null?"hello":s;
    }
    @RequestMapping("byeFeign")
    public String test2(String s ){
        return s==null?"bye":s;
    }
}
