package org.mm;

import org.mm.service.CourseService;

public class Application {
    public static void main(String[] args) {
        var courseService = new CourseService();
        System.out.println(courseService.getAll());
    }
}