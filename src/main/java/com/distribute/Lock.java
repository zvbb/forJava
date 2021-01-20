package com.distribute;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * ******************************
 * author：      张志聪
 * createTime:   2021/1/19 11:49
 * description:  分布式锁
 * version:      V1.0
 * ******************************
 */
public class Lock {
    private Integer cnt = 0;
    private final RedissonClient redisson;
    private final RLock lock;


    public Lock() {
        Config config = new Config();
        config.useMasterSlaveServers().setMasterAddress("redis://139.224.72.178:6377")
                .setPassword("WtIpa01S")
                .setDatabase(0);

//        config.useSingleServer().setAddress("redis://139.224.72.178:6377")
//                .setPassword("WtIpa01S")
//                .setDatabase(0);
        redisson = Redisson.create(config);
        lock = redisson.getLock("testLock");
    }

    public void add() {

        lock.lock(10, TimeUnit.SECONDS);

        try {
            cnt++;
        } finally {
            lock.unlock();
        }
    }

    public Integer getCnt() {
        return cnt;
    }

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new Lock();
        CountDownLatch countDownLatch = new CountDownLatch(20);

        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    lock.add();
                }
                countDownLatch.countDown();
            }).start();
        }

        countDownLatch.await();
        System.out.println(lock.getCnt());
    }
}
