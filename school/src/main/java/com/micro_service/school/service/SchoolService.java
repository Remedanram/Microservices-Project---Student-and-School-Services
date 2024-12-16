package com.micro_service.school.service;

import com.micro_service.school.client.StudentClient;
import com.micro_service.school.entity.School;
import com.micro_service.school.repositoy.SchoolRepository;
import com.micro_service.school.response.FullSchoolResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository repository;
    private final StudentClient client;

    public void saveSchool(School school){
        repository.save(school);
    }
    public List<School> findAllSchool(){
        return repository.findAll();
    }
    public FullSchoolResponse findSchoolWithStudent(Integer schoolId) {
        var school= repository.findById(schoolId)
                .orElse(School.builder()
                        .name("NOT_FOUND")
                        .email("NOT_FOUND")
                        .build());
        var students=client.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
