package com.zq.main;

import com.zq.service.UserReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * 入口
 */
public class Main {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-main.xml");

        UserReader userReader = context.getBean(UserReader.class);
        userReader.getById(1L);

        System.err.println("---------- end ----------");

        CountDownLatch latch = new CountDownLatch(1);
        latch.await();
    }

}
