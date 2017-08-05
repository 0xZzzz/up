package com.zq.main;

import com.zq.dao.AdministratorDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 入口
 */
public class Main {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-main.xml");

        AdministratorDao administratorDao = context.getBean(AdministratorDao.class);

        System.err.println(administratorDao.getById(1L));
    }

}
