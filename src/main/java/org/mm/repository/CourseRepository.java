package org.mm.repository;

import org.mm.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository implements CrudRepository<Course> {

    @Override
    public List<Course> findAll() {
    var courses = new ArrayList<Course>();
        courses.add(new Course(1,
                               "Spring course",
                               "Spring basics configuration",
                               "http://www.spring.io"));
        return courses;
    }
}
