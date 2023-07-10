package com.example.DBservice.DBservice.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="departments")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "department_name", nullable = false, unique = true)
    private String departmentName;

    @OneToMany(mappedBy = "department")
    private List<Programme> programmeList;

    @OneToMany(mappedBy = "department")
    private List<Faculty> facultyList;
}
