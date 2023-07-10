package com.example.DBservice.DBservice.dao;

import com.example.DBservice.DBservice.model.Programme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammesRepo extends JpaRepository<Programme, Integer> {
}
