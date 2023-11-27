package com.courseselling.courseselling.website.Controller;

import com.courseselling.courseselling.website.Entity.Course;
import com.courseselling.courseselling.website.Service.CourseService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/course")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping(path = "/create")
    public String createNewCourse(@Valid @RequestBody Course course){
        return courseService.createCourse(course);
    }
    @GetMapping
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

}
