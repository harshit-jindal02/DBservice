package com.example.DBservice.DBservice.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name="students")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Student implements Serializable {
    @Id
    @Column(name="enrollment_number")
    private int enrollment_number;

    @Column(name = "student_name", nullable = false)
    private String student_name;

    @Column(name = "student_gender", nullable = false)
    private String student_gender;

    @Column(name = "student_dob", nullable = false)
    private int student_dob;

    @Column(name="batch_year", nullable = false)
    private int batch_year;

    @ManyToOne
    private Section sections;

}