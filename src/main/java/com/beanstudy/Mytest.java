package com.beanstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admin
 */
public class Mytest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
        A a = (A) context.getBean(A.class);
        System.out.println(a);
    }

}
