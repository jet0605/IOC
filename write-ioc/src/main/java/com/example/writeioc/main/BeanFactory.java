package com.example.writeioc.main;

public interface BeanFactory {
    //根据bean的name获得bean对象
    Object getBean(String beanName);
}
