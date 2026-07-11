package com.campusplacement.backend.service;
import com.campusplacement.backend.entity.User;
import com.campusplacement.backend.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import com.campusplacement.backend.dto.StudentProfileRequest;
import com.campusplacement.backend.dto.StudentProfileResponse;
import com.campusplacement.backend.entity.Student;
import com.campusplacement.backend.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
private final UserRepository userRepository;

public StudentService(
        StudentRepository studentRepository,
        UserRepository userRepository) {

    this.studentRepository = studentRepository;
    this.userRepository = userRepository;
}

    public StudentProfileResponse createProfile(StudentProfileRequest request) {

        Student student = new Student();

        student.setFullName(request.getFullName());
        student.setPhone(request.getPhone());
        student.setBranch(request.getBranch());
        student.setCgpa(request.getCgpa());
        student.setGraduationYear(request.getGraduationYear());
        student.setSkills(request.getSkills());
        student.setResumeUrl(request.getResumeUrl());
        student.setLinkedIn(request.getLinkedIn());
        student.setGithub(request.getGithub());
        Authentication authentication =
        SecurityContextHolder.getContext().getAuthentication();

String email = authentication.getName();

User user = userRepository.findByEmail(email)
        .orElseThrow(() -> new RuntimeException("User not found"));

student.setUser(user);
        studentRepository.save(student);

        return new StudentProfileResponse("Student profile created successfully");
    }
}