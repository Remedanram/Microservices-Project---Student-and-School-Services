package com.micro_service.school.controller;

import com.micro_service.school.entity.School;
import com.micro_service.school.response.FullSchoolResponse;
import com.micro_service.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService service;

    @GetMapping("/hello")
    public String hello(){
        return "Hello form school service";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody School school){
        service.saveSchool(school);
    }
    @GetMapping
    public ResponseEntity<List<School>> findAllStudents(){
        return ResponseEntity.ok(service.findAllSchool());
    }
    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findAllStudents
            (@PathVariable("school-id") Integer schoolId){
        return
                ResponseEntity.ok(service.findSchoolWithStudent(schoolId));
    }
}
