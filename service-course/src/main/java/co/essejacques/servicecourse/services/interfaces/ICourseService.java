package co.essejacques.servicecourse.services.interfaces;

import co.essejacques.servicecourse.data.entity.Course;
import co.essejacques.servicecourse.data.enums.CourseStatus;

import java.util.List;

public interface ICourseService {
    List<Course> getAllCourses();
    List<Course> getCoursesByStatus(CourseStatus courseStatus);
    Course getCourseById(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
    Course updateCourse(Long id, Course course);
}
