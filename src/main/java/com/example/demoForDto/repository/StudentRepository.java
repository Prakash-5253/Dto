package com.example.demoForDto.repository;

import com.example.demoForDto.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
}
