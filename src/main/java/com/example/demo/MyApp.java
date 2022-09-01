package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("trackerApplication.xml");

        var coach = classPathXmlApplicationContext.getBean("myCoach", ICoach.class);
        System.out.println(coach.GetWorkout());
        classPathXmlApplicationContext.close();
    }
}
