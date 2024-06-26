package co.essejacques.servicecourse.mobile.controller;


import co.essejacques.servicecourse.data.entity.Course;
import co.essejacques.servicecourse.data.enums.CourseStatus;
import co.essejacques.servicecourse.services.interfaces.ICourseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/courses")
@RestController
@Tag(name = "Course", description = "Course API")
public class CourseController {

    private final ICourseService courseService;


    @PostMapping("")
    public Course saveCourse(Course course)  {
        return this.courseService.saveCourse(course);
    }

    @GetMapping()
    public List<Course> getCourses()  {
        return this.courseService.getAllCourses();
    }

    @GetMapping("/status/{status}")
    public List<Course> getCoursesByStatus(@PathVariable CourseStatus status)  {
        return this.courseService.getCoursesByStatus(status);
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id)  {
        return this.courseService.getCourseById(id);
    }


}
