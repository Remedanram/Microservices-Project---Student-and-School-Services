package com.micro_service.school.client;

import com.micro_service.school.Student.Student;
import jakarta.ws.rs.Path;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="student-service", url="${application.config.students-url}")
public interface StudentClient{
    @GetMapping("school/{school-id}")

    List<Student>findAllStudentsBySchool(@PathVariable("school-id") Integer schoolId);



}
