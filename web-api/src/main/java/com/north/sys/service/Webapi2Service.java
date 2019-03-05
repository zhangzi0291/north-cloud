package com.north.sys.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("web-api2")
public interface Webapi2Service {

    @RequestMapping("helloFeign")
    String hello(@PathVariable("s") String s);
    @RequestMapping("byeFeign")
    String bye();
}
