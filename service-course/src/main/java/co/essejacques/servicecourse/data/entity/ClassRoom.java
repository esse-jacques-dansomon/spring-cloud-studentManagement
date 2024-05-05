package co.essejacques.servicecourse.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "class_room")
public class ClassRoom {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String division;
    private String level;

    @OneToMany(mappedBy = "classRoom")
    private Set<Course> courses;


}