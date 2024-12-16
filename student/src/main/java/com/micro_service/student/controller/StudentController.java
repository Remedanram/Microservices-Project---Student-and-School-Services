package com.micro_service.student.controller;

import com.micro_service.student.entity.Student;
import com.micro_service.student.repositoy.StudentRepository;
import com.micro_service.student.service.StudentService;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Student student){
        service.saveStudents(student);
    }
    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents(){
        return ResponseEntity.ok(service.findAllStudents());
    }
    @GetMapping("school/{school-id}")
    public ResponseEntity<List<Student>> findAllStudents(@PathVariable("school-id") Integer schoolId){
        return ResponseEntity.ok(service.findAllStudentsBySchool(schoolId));
    }
}
