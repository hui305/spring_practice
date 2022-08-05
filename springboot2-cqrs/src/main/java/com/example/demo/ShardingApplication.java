package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO
 *
 * @author bobstone
 * @version 1.0
 * @date 2022/8/5 18:52
 */
@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class ShardingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingApplication.class,args);
    }
}
