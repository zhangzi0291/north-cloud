package com.north;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NorthEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NorthEurekaApplication.class, args);
    }

}
