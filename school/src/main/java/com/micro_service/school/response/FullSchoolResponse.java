package com.micro_service.school.response;

import com.micro_service.school.Student.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullSchoolResponse {
    private String name;
    private String email;
    List<Student> students;
}
