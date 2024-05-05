package co.essejacques.servicecourse.services.interfaces;

import co.essejacques.servicecourse.data.entity.Seance;
import co.essejacques.servicecourse.data.enums.CourseStatus;

import java.util.List;

public interface ISeanceService {

    List<Seance> getSeances();
    List<Seance> getSeancesByStatus(CourseStatus courseStatus);
    Seance getSeanceById(Long id);
    Seance saveSeance(Seance seance);
    void deleteSeance(Long id);
    Seance updateSeance(Long id, Seance seance);

}
