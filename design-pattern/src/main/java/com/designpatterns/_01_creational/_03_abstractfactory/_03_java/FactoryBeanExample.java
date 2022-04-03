package com.designpatterns._01_creational._03_abstractfactory._03_java;

import com.designpatterns._01_creational._02_factorymethod._02_after.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship bean = applicationContext.getBean(Ship.class);
        System.out.println(bean);
    }

}
