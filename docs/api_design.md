# API Design

## Overview

The Campus Placement Portal follows a RESTful API architecture where the React frontend communicates with the Spring Boot backend using HTTP requests. All APIs return JSON responses and are secured using JWT authentication. The APIs are grouped into Authentication, Student, Company, Job, Application, and Admin modules.

---

## Authentication APIs

| Method | Endpoint             | Description                              |
| ------ | -------------------- | ---------------------------------------- |
| POST   | `/api/auth/register` | Register a new user                      |
| POST   | `/api/auth/login`    | Authenticate user and generate JWT token |
| POST   | `/api/auth/logout`   | Logout authenticated user                |

---

## Student APIs

| Method | Endpoint                     | Description            |
| ------ | ---------------------------- | ---------------------- |
| GET    | `/api/students/profile`      | Get student profile    |
| PUT    | `/api/students/profile`      | Update student profile |
| POST   | `/api/students/resume`       | Upload resume          |
| GET    | `/api/students/applications` | View applied jobs      |

---

## Company APIs

| Method | Endpoint                            | Description               |
| ------ | ----------------------------------- | ------------------------- |
| POST   | `/api/companies/jobs`               | Create a new job posting  |
| GET    | `/api/companies/jobs`               | View all posted jobs      |
| PUT    | `/api/companies/jobs/{id}`          | Update job details        |
| DELETE | `/api/companies/jobs/{id}`          | Delete a job posting      |
| GET    | `/api/companies/applicants/{jobId}` | View applicants for a job |

---

## Job APIs

| Method | Endpoint           | Description                 |
| ------ | ------------------ | --------------------------- |
| GET    | `/api/jobs`        | Retrieve all available jobs |
| GET    | `/api/jobs/{id}`   | Get job details             |
| GET    | `/api/jobs/search` | Search jobs using filters   |

---

## Application APIs

| Method | Endpoint                          | Description               |
| ------ | --------------------------------- | ------------------------- |
| POST   | `/api/applications/apply/{jobId}` | Apply for a job           |
| GET    | `/api/applications/status`        | View application status   |
| PUT    | `/api/applications/{id}`          | Update application status |

---

## Admin APIs

| Method | Endpoint                | Description                   |
| ------ | ----------------------- | ----------------------------- |
| GET    | `/api/admin/dashboard`  | Retrieve dashboard statistics |
| GET    | `/api/admin/students`   | View all students             |
| GET    | `/api/admin/companies`  | View all companies            |
| DELETE | `/api/admin/users/{id}` | Remove a user                 |
| GET    | `/api/admin/reports`    | Generate placement reports    |

---

## API Response Format

### Success Response

```json
{
  "success": true,
  "message": "Request processed successfully.",
  "data": {}
}
```

### Error Response

```json
{
  "success": false,
  "message": "Invalid request.",
  "error": {}
}
```

---

## Authentication & Security

* JWT-based authentication
* Role-Based Access Control (Student, Company, Admin)
* Password encryption using BCrypt
* Input validation on all endpoints
* Secure HTTP methods following REST principles

---

## HTTP Status Codes

| Status Code | Meaning               |
| ----------- | --------------------- |
| 200         | Request Successful    |
| 201         | Resource Created      |
| 400         | Bad Request           |
| 401         | Unauthorized          |
| 403         | Forbidden             |
| 404         | Resource Not Found    |
| 500         | Internal Server Error |
