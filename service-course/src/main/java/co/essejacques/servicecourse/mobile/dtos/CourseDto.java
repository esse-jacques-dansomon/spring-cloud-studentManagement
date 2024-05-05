package co.essejacques.servicecourse.mobile.dtos;

import co.essejacques.servicecourse.data.enums.CourseStatus;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link co.essejacques.servicecourse.data.entity.Course}
 */
@Value
public class CourseDto implements Serializable {
    Long id;
    String module;
    String professor;
    CourseStatus status;
}