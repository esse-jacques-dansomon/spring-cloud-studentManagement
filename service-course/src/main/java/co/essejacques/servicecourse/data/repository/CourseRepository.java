package co.essejacques.servicecourse.data.repository;

import co.essejacques.servicecourse.data.entity.Course;
import co.essejacques.servicecourse.data.enums.CourseStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findAllByStatus(CourseStatus courseStatus);
}