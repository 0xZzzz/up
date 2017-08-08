package com.zq.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * 入口
 */
public class Main {

    public static void main(String[] args) throws Exception {

        new ClassPathXmlApplicationContext("spring/spring-main.xml");

        CountDownLatch latch = new CountDownLatch(1);
        latch.await();
    }

}
