package com.hui305;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by hui_stone on 2020/2/29 0029.
 */
@SpringBootTest
@Slf4j
public class RedissonTest {

    private static final String KEY = "LOCK_KEY";

    @Autowired
    private RedissonClient redissonClient;

    @Test
    public void testLock(){

        Long productId = 1L;
        RLock locker = redissonClient.getLock(KEY);
        try {
            //加锁 操作很类似Java的ReentrantLock机制
            locker.lock();
            log.info("获取锁");
            //模拟处理业务
            Thread.sleep(10000);
            log.info("处理业务结束");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放锁
            locker.unlock();
            log.info("释放锁");
        }

    }
}
