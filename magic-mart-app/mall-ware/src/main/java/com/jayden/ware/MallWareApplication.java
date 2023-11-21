package com.jayden.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.jayden.ware.dao")
@EnableDiscoveryClient
public class MallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallWareApplication.class, args);
    }

}
