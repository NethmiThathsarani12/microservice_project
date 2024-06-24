package com.example.servive_registory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiveRegistoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiveRegistoryApplication.class, args);
    }

}
