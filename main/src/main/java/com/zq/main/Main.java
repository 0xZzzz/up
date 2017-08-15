package com.zq.main;

import com.zq.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * 入口
 */
public class Main {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-main.xml");

        UserDao u = context.getBean(UserDao.class);
        System.err.println(u.getById(1));

        CountDownLatch latch = new CountDownLatch(1);
        latch.await();
    }

}
