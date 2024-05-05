package co.essejacques.servicecourse.data.repository;

import co.essejacques.servicecourse.data.entity.Seance;
import co.essejacques.servicecourse.data.enums.CourseStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeanceRepository extends JpaRepository<Seance, Long> {
  List<Seance> findAllByStatus(CourseStatus courseStatus);
}