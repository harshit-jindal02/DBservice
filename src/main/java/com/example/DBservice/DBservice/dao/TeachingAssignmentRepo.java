package com.example.DBservice.DBservice.dao;

import com.example.DBservice.DBservice.model.TeachingAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachingAssignmentRepo extends JpaRepository<TeachingAssignment, Integer> {
}
