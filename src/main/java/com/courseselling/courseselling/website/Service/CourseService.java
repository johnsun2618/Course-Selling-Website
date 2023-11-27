package com.courseselling.courseselling.website.Service;

import com.courseselling.courseselling.website.Entity.Course;

import java.util.List;

public interface CourseService {

    String createCourse(Course course);
    List<Course> getAllCourse();

}
