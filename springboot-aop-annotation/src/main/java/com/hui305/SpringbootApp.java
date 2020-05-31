package com.hui305;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by hui_stone on 2020/5/26 0026.
 */
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class SpringbootApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApp.class, args);
    }
}
