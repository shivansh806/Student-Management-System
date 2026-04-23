package com.rest.RestApi.service.imp;

import com.rest.RestApi.dto.ActualStudentData;
import com.rest.RestApi.entity.Student;
import com.rest.RestApi.service.studentservice;
import com.rest.RestApi.repository.studentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImp implements studentservice {

    private final studentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudentData(ActualStudentData actualStudentData) {
        Student student = new Student();
        student.setName(actualStudentData.getName());
        student.setEmail(actualStudentData.getEmail());
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        Student st = studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User not found with this id "+id));
        return st;
    }

    @Override
    public boolean deleteStudentId(Long id) {
        if(!studentRepository.existsById(id)){
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }
}
