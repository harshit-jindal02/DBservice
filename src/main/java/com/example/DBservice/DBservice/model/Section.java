package com.example.DBservice.DBservice.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="sections",
        uniqueConstraints=
        @UniqueConstraint(columnNames={"semester_id", "section_number"})
)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Section implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="semester_id", nullable = false)
    private Semester semester_id;

    @Column(name="section_number", nullable = false)
    private int section_number;

    @OneToMany
    private List<TeachingAssignment> teachingAssignment;

    @OneToMany
    private List<Student> students;
}
