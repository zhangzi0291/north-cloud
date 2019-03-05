package com.north.configure;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class GatewayRouterConfiguration {

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//
//        return builder.routes()
//                .route(r -> r.path("/image/webp")
//                        .filters(f ->
//                                f.addResponseHeader("X-AnotherHeader", "baz"))
//                        .uri("http://httpbin.org:80")
//                )
//                .route(r -> r.path("/api/**")
//                        .filters(f ->
//                                f.addResponseHeader("X-AnotherHeader", "baz"))
//                        .uri("http://192.168.184.1:65434/WEB-API/")
//                )
//                .build();
//    }

}
