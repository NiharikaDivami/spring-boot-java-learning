package com.divami.SpringWithoutBoot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        // ApplicationContext is the Spring container
        // It is responsible for:
        // 1. Reading spring.xml
        // 2. Creating objects (beans)
        // 3. Managing their lifecycle
        // 4. Injecting dependencies

        // ClassPathXmlApplicationContext loads spring.xml from classpath
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        // Getting the bean with id "dev" from Spring container
        // Spring returns an object of type Dev
        Dev obj = context.getBean(Dev.class);

        // Example of accessing another property (currently commented)
        // System.out.println(obj.getAge());

   
        obj.build();

        // Normal Java print statement
        System.out.println("Hello World!");
    }
}
