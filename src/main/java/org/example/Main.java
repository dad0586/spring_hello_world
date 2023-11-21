package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring-config.xml");
        Professor professor = (Professor) context.getBean("professor" , Professor.class);
        System.out.println(professor);

    }
}