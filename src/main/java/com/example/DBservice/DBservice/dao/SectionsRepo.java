package com.example.DBservice.DBservice.dao;

import com.example.DBservice.DBservice.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionsRepo extends JpaRepository<Section, Integer> {
}
