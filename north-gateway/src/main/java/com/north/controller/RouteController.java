package com.north.controller;

import com.north.entity.GatewayRouteDefinition;
import com.north.service.DynamicRouteServiceImpl;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@RestController
public class RouteController {

    @Resource
    private DynamicRouteServiceImpl dynamicRouteService;
    //增加路由
    @PostMapping("/add")
    public String add(@RequestBody RouteDefinition definition) {
        try {
//            RouteDefinition definition = assembleRouteDefinition(gwdefinition);
            return this.dynamicRouteService.add(definition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "succss";
    }

    //删除路由
    @DeleteMapping("/routes/{id}")
    public Mono<ResponseEntity<Object>> delete(@PathVariable String id) {
        return this.dynamicRouteService.delete(id);
    }

    //更新路由
    @PostMapping("/update")
    public String update(@RequestBody RouteDefinition definition) {
//        RouteDefinition definition = assembleRouteDefinition(gwdefinition);
        return this.dynamicRouteService.update(definition);
    }

//    public RouteDefinition assembleRouteDefinition(GatewayRouteDefinition gwdefinition){
//        RouteDefinition rd = new RouteDefinition();
//        rd.setFilters();
//
//    }
}
