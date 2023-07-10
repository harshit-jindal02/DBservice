package com.example.DBservice.DBservice.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Set;

@Entity
@Table(name="semester",
        uniqueConstraints=
        @UniqueConstraint(columnNames={"programmes_course_id", "semester_number"})
)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Semester implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="semester_id")
    private int semester_id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Programme programmes;

    @Column(name="semester_number", nullable = false)
    private int semester_number;

    @ManyToMany
    private List<Subject> subjects;

    @OneToMany(mappedBy = "semester_id")
    private List<Section> sectionList;
}