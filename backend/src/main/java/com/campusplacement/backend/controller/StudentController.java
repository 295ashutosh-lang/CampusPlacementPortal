package com.campusplacement.backend.controller;

import com.campusplacement.backend.dto.StudentProfileRequest;
import com.campusplacement.backend.dto.StudentProfileResponse;
import com.campusplacement.backend.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/profile")
    public StudentProfileResponse createProfile(
            @RequestBody StudentProfileRequest request) {

        return studentService.createProfile(request);
    }
}