package com.example.writeioc.test;

import com.example.writeioc.bean.A;
import com.example.writeioc.bean.B;
import com.example.writeioc.main.BeanFactory;
import com.example.writeioc.main.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("/applicationContext.xml");
        A a = (A)beanFactory.getBean("A");
        System.out.println(a.getName());
        B b = (B)beanFactory.getBean("B");
        System.out.println(b.getA().getName());
    }
}
