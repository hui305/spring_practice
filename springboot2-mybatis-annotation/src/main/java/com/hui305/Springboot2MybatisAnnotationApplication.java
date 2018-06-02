package com.hui305;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hui305.mapper")
@SpringBootApplication
public class Springboot2MybatisAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2MybatisAnnotationApplication.class, args);
	}
}
