package com.example.DBservice.DBservice.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="subjects")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Subject implements Serializable {
    @Id
    @Column(name="subject_id")
    private int subject_id;

    @Column(name="subject_name", nullable = false)
    private String subject_name;

    @ManyToMany
    private List<Faculty> faculties;

    @ManyToMany
    private List<Semester> semesterList;

    @OneToMany
    private List<TeachingAssignment> teachingAssignment;
}
