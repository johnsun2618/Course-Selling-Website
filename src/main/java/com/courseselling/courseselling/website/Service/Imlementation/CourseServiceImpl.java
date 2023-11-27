package com.courseselling.courseselling.website.Service.Imlementation;

import com.courseselling.courseselling.website.Entity.Course;
import com.courseselling.courseselling.website.Repository.CourseRepo;
import com.courseselling.courseselling.website.Service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepo courseRepo;

    public CourseServiceImpl(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

//    this will create all the new course that has been created in database
    @Override
    public String createCourse(Course course) {
        this.courseRepo.save(course);
        return "New Course Added Successfully";
    }

//    this will retrieve all course in the database
    @Override
    public List<Course> getAllCourse() {
        return this.courseRepo.findAll();
    }
}
