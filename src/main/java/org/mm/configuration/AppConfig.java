package org.mm.configuration;

import org.mm.repository.CourseRepository;
import org.mm.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "courseService")
    public CourseService getCourseService() {
        return new CourseService(getCourseRepository());
    }

    @Bean(name = "courseRepository")
    public CourseRepository getCourseRepository(){
        return new CourseRepository();
    }
}
