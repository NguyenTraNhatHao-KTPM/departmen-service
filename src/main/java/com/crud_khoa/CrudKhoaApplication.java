package com.crud_khoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class CrudKhoaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrudKhoaApplication.class, args);
    }

}
