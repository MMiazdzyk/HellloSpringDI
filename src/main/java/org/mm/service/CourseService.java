package org.mm.service;

import org.mm.model.Course;
import org.mm.repository.CourseRepository;

import java.util.List;
import java.util.Optional;

public class CourseService implements CrudService<Course> {

    private CourseRepository courseRepository;

    public CourseService() {
        this.courseRepository  = new CourseRepository();
    }

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course create(Course course) {
        return null;
    }

    @Override
    public Optional<Course> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
