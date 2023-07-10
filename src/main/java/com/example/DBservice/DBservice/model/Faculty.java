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
@Table(name = "faculties")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Faculty implements Serializable {
    @Id
    @Column(name="faculty_id")
    private int faculty_id;

    @Column(name="faculty_name", nullable = false)
    private String faculty_name;

    @Column(name="faculty_gender", nullable = false)
    private String faculty_gender;

    @ManyToOne
    @JoinColumn(name= "department_id", nullable = false)
    private Department department;

    @OneToMany
    private List<TeachingAssignment> teachingAssignment;

}
