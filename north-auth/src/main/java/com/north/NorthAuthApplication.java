package com.north;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableAuthorizationServer
public class NorthAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(NorthAuthApplication.class, args);
    }

}
