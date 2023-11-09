package com.woniu.aw.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.woniu.aw.springboot.jgdt.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class WoniuAwSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(WoniuAwSpringbootApplication.class,args);
    }
}
