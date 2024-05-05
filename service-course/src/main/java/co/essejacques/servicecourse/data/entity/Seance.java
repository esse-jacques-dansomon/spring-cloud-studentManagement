package co.essejacques.servicecourse.data.entity;

import co.essejacques.servicecourse.data.enums.CourseStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "seance")
public class Seance {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDateTime date;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private Course course;

    @Enumerated(EnumType.STRING)
    private CourseStatus status;

}