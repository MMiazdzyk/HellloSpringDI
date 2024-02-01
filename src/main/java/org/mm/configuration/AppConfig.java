package org.mm.configuration;

import org.mm.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "courseService")
    public CourseService getCourseService() {
        return new CourseService();
    }
}
