package org.mm;

import org.mm.configuration.AppConfig;
import org.mm.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CourseService courseService = applicationContext.getBean("courseService", CourseService.class);

        System.out.println(courseService.getAll());
    }
}