package co.essejacques.servicecourse.services.impl;

import co.essejacques.servicecourse.data.entity.Course;
import co.essejacques.servicecourse.data.enums.CourseStatus;
import co.essejacques.servicecourse.data.repository.CourseRepository;
import co.essejacques.servicecourse.services.interfaces.ICourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService  implements ICourseService {

    private final CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public List<Course> getCoursesByStatus(CourseStatus courseStatus) {
        return this.courseRepository.findAllByStatus(courseStatus);
    }

    @Override
    public Course getCourseById(Long id) {
        return this
                .courseRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));
    }

    @Override
    public Course saveCourse(Course course) {
        return this.courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        this.courseRepository.deleteById(id);
    }

    @Override
    public Course updateCourse(Long id, Course course) {
        return this.courseRepository.save(course);
    }
}
