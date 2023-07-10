package com.example.DBservice.DBservice.dao;

import com.example.DBservice.DBservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepo extends JpaRepository<Student, Integer> {
}