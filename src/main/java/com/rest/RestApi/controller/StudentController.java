package com.rest.RestApi.controller;

import com.rest.RestApi.dto.ActualStudentData;
import com.rest.RestApi.dto.StudentDto;
import com.rest.RestApi.entity.Student;
import com.rest.RestApi.service.imp.StudentServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class StudentController {

    private final StudentServiceImp studentServiceImp;

    @GetMapping("/students")
    public ResponseEntity<List<StudentDto>> getAllStudents(){
        List<Student> student = studentServiceImp.getAllStudents();
        List<StudentDto> studentDto = student.stream().map(student1 -> new StudentDto(student1.getId(), student1.getName(), student1.getEmail())).toList();
        return ResponseEntity.status(HttpStatus.OK).body(studentDto);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentDto> getStudentByID(@PathVariable Long id){
        Student student = studentServiceImp.getStudentById(id);
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setEmail(student.getEmail());
        return ResponseEntity.status(HttpStatus.OK).body(studentDto);
    }

    @PostMapping("/students")
    public ResponseEntity<StudentDto> createStudent(@RequestBody ActualStudentData actualStudentData){
        Student student = studentServiceImp.saveStudentData(actualStudentData);
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setEmail(student.getEmail());
      return ResponseEntity.status(HttpStatus.CREATED).body(studentDto);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable Long id){
        boolean isDeleted = studentServiceImp.deleteStudentId(id);
        if(!isDeleted){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }



}
