package co.essejacques.servicecourse.data.entity;

import co.essejacques.servicecourse.data.enums.CourseStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "module", nullable = false)
    private String module;

    @Column(name = "professor", nullable = false)
    private String professor;

    @OneToMany(mappedBy = "course")
    private Set<Seance> seances;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private ClassRoom classRoom;

    @Enumerated(EnumType.STRING)
    private CourseStatus status;
}