package com.zq.main;

import com.zq.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * 入口
 */
public class Main {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-main.xml");

        UserService userService = context.getBean(UserService.class);
        System.err.println(userService.auth("root", "root"));

        CountDownLatch latch = new CountDownLatch(1);
        latch.await();
    }

}
