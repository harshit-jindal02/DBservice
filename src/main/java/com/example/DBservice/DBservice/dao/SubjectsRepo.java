package com.example.DBservice.DBservice.dao;

import com.example.DBservice.DBservice.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepo extends JpaRepository<Subject,Integer> {
}
