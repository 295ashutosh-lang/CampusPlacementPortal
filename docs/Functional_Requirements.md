# Web Application Requirements Document

## Project Overview

The Campus Placement Portal is a full-stack web application developed to simplify and automate the campus recruitment process. The platform connects students, recruiters, and placement administrators through a centralized system where students can apply for jobs, companies can manage recruitment, and administrators can oversee placement activities. The application improves efficiency, transparency, and communication while reducing manual paperwork.

---

# Target Users & Use Cases

## Target Users

* Students
* Recruiters / Companies
* Placement Administrator

## Primary Goals

### Student

* Create and manage profile
* Upload resume
* Search and apply for jobs
* Track application status

### Company

* Register company
* Post job openings
* View applicants
* Shortlist or reject candidates

### Administrator

* Manage users
* Verify companies
* Manage job postings
* View placement statistics
* Generate reports

## Problems Solved

* Eliminates manual placement management.
* Centralizes student and recruiter information.
* Provides real-time application tracking.
* Improves communication between stakeholders.

---

# Core Functionality

## User Authentication

* Registration
* Login
* JWT Authentication
* Role-based authorization
* Forgot Password

## Student Module

* Student Profile
* Resume Upload
* View Jobs
* Apply for Jobs
* Track Application Status

## Company Module

* Company Profile
* Create Job
* Update Job
* Delete Job
* View Applicants
* Shortlist Candidates

## Admin Module

* Dashboard
* Manage Students
* Manage Companies
* Manage Jobs
* Placement Reports

## Dashboard & Analytics

* Total Students
* Total Companies
* Active Jobs
* Applications Received
* Placement Statistics

---

# User Interface Requirements

**Design Style**

* Modern
* Clean
* Professional Dashboard

**Color Theme**

* Primary: Blue (#2563EB)
* Secondary: White
* Accent: Green
* Error: Red

**Layout**

* Multi-page Dashboard

**Responsive Design**

* Desktop (Priority)
* Tablet
* Mobile

**UI Components**

* Navigation Bar
* Sidebar
* Dashboard Cards
* Data Tables
* Search Bar
* Filters
* Forms
* Charts
* File Upload
* Pagination
* Toast Notifications

---

# Data Model

## Collections

### Users

* userId
* name
* email
* password
* role

### Students

* studentId
* branch
* semester
* CGPA
* skills
* resume

### Companies

* companyId
* companyName
* industry
* HRName
* email

### Jobs

* jobId
* title
* description
* eligibility
* package
* deadline

### Applications

* applicationId
* studentId
* jobId
* status
* appliedDate

### Authentication

* JWT Token
* Role-Based Access Control (RBAC)

---

# User Flow

### Student

Register → Login → Complete Profile → Upload Resume → Browse Jobs → Apply → Track Status

### Company

Register → Login → Create Company Profile → Post Job → Review Applicants → Shortlist Candidates

### Administrator

Login → Verify Users → Manage Companies → Manage Jobs → View Dashboard → Generate Reports

---

# Technical Requirements

## Frontend

* React.js
* React Router
* Axios
* Material UI

## Backend

* Spring Boot
* Spring Security
* JWT Authentication

## Database

* MongoDB Atlas

## REST APIs

* Authentication API
* Student API
* Company API
* Job API
* Application API
* Admin API

## Performance

* API Response < 500 ms
* Dashboard Load < 2 seconds
* Optimized Database Queries

## Security

* JWT Authentication
* Password Encryption (BCrypt)
* Input Validation
* Role-Based Authorization
* HTTPS

---

# Accessibility & Compliance

## Accessibility

* WCAG 2.1 Level AA
* Keyboard Navigation
* Proper Labels
* Color Contrast
* Responsive Layout

## Compliance

* Basic Data Privacy
* Secure Password Storage
* User Consent for Data Collection

---

# Examples & Inspiration

### Similar Applications

* LinkedIn Jobs
* Internshala
* Indeed
* Naukri Campus
* Superset

### Features to Emulate

* Dashboard Layout
* Job Search & Filters
* Resume Upload
* Application Tracking
* Analytics Dashboard

---

# Implementation Priorities

## Must Have

* Authentication
* Student Dashboard
* Company Dashboard
* Admin Dashboard
* Job Management
* Application Management
* Resume Upload

## Nice to Have

* Email Notifications
* Search Filters
* Charts & Analytics
* Profile Picture Upload

## Future Enhancements

* Interview Scheduling
* AI Resume Screening
* Skill Recommendation
* Company Reviews
* Real-time Notifications
* Mobile Application

---

# Additional Context

The application follows a modular architecture using React, Spring Boot, MongoDB, and REST APIs. Development follows Agile principles with Git-based version control, GitHub for repository management, and GitHub Actions for Continuous Integration and Continuous Deployment (CI/CD). The project is intended to demonstrate end-to-end full-stack development, authentication, API design, database management, deployment, and modern software engineering practices suitable for a professional portfolio.

