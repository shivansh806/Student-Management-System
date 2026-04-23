package com.rest.RestApi.repository;

import com.rest.RestApi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student, Long> {
}
