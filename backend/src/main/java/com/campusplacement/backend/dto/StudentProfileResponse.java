package com.campusplacement.backend.dto;

public class StudentProfileResponse {

    private String message;

    public StudentProfileResponse() {
    }

    public StudentProfileResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}