package com.kiyotakeshi.applicationContextExperiment;

import com.kiyotakeshi.applicationContextExperiment.beans.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        // Application Context holds bean definitions and contains registry of application components
        try (var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            var car = context.getBean(Car.class);
            car.drive();

//            String[] allBeanNames = context.getBeanDefinitionNames();
//            for (String beanName: allBeanNames){
//                System.out.println(beanName);
//            }

            System.out.println("--------- all the beans in our applicationContext container ---------");
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

//        var context = new AnnotationConfigApplicationContext(Car.class);
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
