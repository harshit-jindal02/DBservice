package com.example.DBservice.DBservice.dao;

import com.example.DBservice.DBservice.model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepo extends JpaRepository<Semester,Integer> {
}
