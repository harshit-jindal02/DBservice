package com.example.DBservice.DBservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="programmes")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Programme implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="course_id")
    private Integer course_id;

    @Column(name="course_name", nullable = false, unique = true)
    private String course_name;

    @ManyToOne
    @JoinColumn(name="department_id",nullable = false)
    private Department department;

    @OneToMany
    private List<Semester> semesters;

}