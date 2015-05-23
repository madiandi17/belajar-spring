package com.wordpress.bmadi.belaja.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("Demo Belajar Spring");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:konfig-spring.xml");
        Hello h = (Hello) context.getBean("hello");
        h.printHello();
    }
}
