package com.example.DBservice.DBservice.dao;

import com.example.DBservice.DBservice.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultiesRepo extends JpaRepository<Faculty, Integer> {
}
