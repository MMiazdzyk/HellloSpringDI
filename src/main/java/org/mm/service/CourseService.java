package org.mm.service;

import org.mm.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseService implements CrudService {

    private List<Course> courses;

    public CourseService() {
        courses = new ArrayList<>();
        courses.add(new Course(1,
                               "Spring course",
                               "Spring basics configuration",
                               "http://www.spring.io"));
    }

    @Override
    public List<Course> getAll() {
        return courses;
    }

    @Override
    public Object create(Object o) {
        return null;
    }

    @Override
    public Optional get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Object o, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
