package com.example.DBservice.DBservice.dao;

import com.example.DBservice.DBservice.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentsRepo extends JpaRepository<Department,Integer> {
}
