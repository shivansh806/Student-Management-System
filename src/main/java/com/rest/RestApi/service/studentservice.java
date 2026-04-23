package com.rest.RestApi.service;

import com.rest.RestApi.dto.ActualStudentData;
import com.rest.RestApi.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface studentservice {

    List<Student> getAllStudents();

    Student saveStudentData(ActualStudentData actualStudentData);

    Student getStudentById(Long id);

    boolean deleteStudentId(Long id);

}
