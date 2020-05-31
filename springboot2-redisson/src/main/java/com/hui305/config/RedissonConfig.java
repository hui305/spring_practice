package com.hui305.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.io.IOException;

/**
 * Created by hui_stone on 2020/2/29 0029.
 */
@Configuration
public class RedissonConfig {

    @Bean(destroyMethod = "shutdown")
    public RedissonClient redisson() throws IOException {
        // 本例子使用的是yaml格式的配置文件，读取使用Config.fromYAML，如果是Json文件，则使用Config.fromJSON
        // 1. 创建Config对象，读取配置属性
        // 2. 创建Redisson对象,传入Config对象
        Config config = Config.fromYAML(RedissonConfig.class.getClassLoader().getResource("redisson-single.yml"));
        return Redisson.create(config);
    }
}