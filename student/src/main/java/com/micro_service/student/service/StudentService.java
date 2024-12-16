package com.micro_service.student.service;

import com.micro_service.student.entity.Student;
import com.micro_service.student.repositoy.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public void saveStudents(Student students){
        repository.save(students);
    }
    public List<Student> findAllStudents(){
        return repository.findAll();
    }

    public List<Student> findAllStudentsBySchool(Integer schoolId) {
        return repository.findBySchoolId(schoolId);
    }
}
