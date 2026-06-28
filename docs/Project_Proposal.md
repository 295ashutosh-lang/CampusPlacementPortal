# Campus Placement Portal

## Prepared by:

Ashutosh Pandey

## Table of Contents

###  Executive Summary

The Campus Placement Portal is a full-stack web application designed to simplify and digitize the campus recruitment process by providing a centralized platform for students, recruiters, and placement administrators. Traditional placement activities often involve manual record-keeping, email communication, and multiple disconnected systems, making the recruitment process inefficient and difficult to manage.
This project aims to address these challenges by offering a secure, role-based platform where students can create profiles, upload resumes, browse available job opportunities, and track their applications. Companies can register, manage their profiles, post job openings, review applications, and shortlist candidates. Placement administrators can monitor the overall recruitment process through an interactive dashboard, manage users, and generate placement statistics.

### Scope

#### Features Included

* Student registration and login
* Company registration and login
* Job posting and management
* Job search and application
* Resume upload
* Application status tracking
* Admin dashboard for user and job management
* Placement statistics and reports

#### Limitations

* Only authorized college users can access the system.
* Online interviews and video conferencing are not included.
* Payment gateway integration is not part of this project.
* Email and SMS notifications are planned for future versions.

## Software Process Model

### Goal of the Software Process Model

The software process model provides a structured approach for planning, designing, developing, testing, deploying, and maintaining the **Campus Placement Portal**. It ensures systematic development, timely completion, improved software quality, effective team collaboration, and the delivery of a reliable and scalable application.

### Selected Software Process Model

**Agile (Scrum) Model**

#### Justification

The Agile (Scrum) model is selected because it supports iterative and incremental software development. The project is divided into multiple development phases where each feature is designed, implemented, tested, and reviewed before moving to the next stage. This approach allows continuous feedback, faster bug detection, flexibility in accommodating requirement changes, and frequent delivery of working software. Since the Campus Placement Portal consists of independent modules such as authentication, job management, application tracking, and dashboards, Agile enables each module to be developed and tested independently before integration.

### Agile Process Lifecycle

#### Software Development Phases

```
Requirement Analysis
        ↓
Project Planning
        ↓
System Design
        ↓
Development
        ↓
Testing
        ↓
Deployment
        ↓
Maintenance
```

#### Requirement Analysis

**Activities:** Gather project requirements, identify stakeholders, define functional and non-functional requirements, and prepare the Software Requirement Specification (SRS).

**Duration:** 3 Days

**Responsibility:** Project Manager, Business Analyst

**Deliverables:** SRS Document, Requirement Analysis Report

---

#### Project Planning

**Activities:** Prepare the project schedule, define milestones, select the technology stack, estimate resources, and identify project risks.

**Duration:** 2 Days

**Responsibility:** Project Manager

**Deliverables:** Project Plan, Timeline, Risk Assessment Report

---

#### System Design

**Activities:** Design the system architecture, database schema, REST API endpoints, UI wireframes, and navigation flow.

**Duration:** 4 Days

**Responsibility:** System Architect, UI/UX Designer

**Deliverables:** System Architecture Diagram, Database Design, API Documentation, UI Wireframes

---

#### Development

**Activities:** Develop the frontend using React, implement backend services with Spring Boot, integrate MongoDB, develop REST APIs, implement JWT authentication, and connect all application modules.

**Duration:** 15 Days

**Responsibility:** Full Stack Developer

**Deliverables:** Source Code, REST APIs, Database Collections, Functional Web Application

---

#### Testing

**Activities:** Perform unit testing, API testing using Postman, integration testing, system testing, fix identified bugs, and validate application functionality.

**Duration:** 5 Days

**Responsibility:** QA Engineer

**Deliverables:** Test Cases, Bug Report, Test Summary Report

---

#### Deployment

**Activities:** Deploy the frontend on Vercel, backend on Render, configure MongoDB Atlas, set up the CI/CD pipeline, and verify the production environment.

**Duration:** 2 Days

**Responsibility:** DevOps Engineer

**Deliverables:** Live Application, Deployment Documentation, CI/CD Workflow

---

#### Maintenance

**Activities:** Monitor application performance, fix reported issues, optimize existing features, improve security, and implement future enhancements.

**Duration:** Ongoing

**Responsibility:** Development Team

**Deliverables:** Updated Releases, Bug Fixes, Enhancement Reports
#### Testing Methodology

* Unit Testing for individual frontend and backend modules.
* Integration Testing to verify communication between React, Spring Boot and MongoDB.
* API Testing using Postman for all REST endpoints.
* System Testing to validate complete application functionality.
* User Acceptance Testing (UAT) to ensure business requirements are satisfied.
* Regression Testing after every major feature implementation.

#### Project Management Practices

* Agile Scrum methodology with iterative development.
* Sprint planning and feature-based implementation.
* Version control using Git and GitHub.
* Task tracking using GitHub Projects/Kanban Board.
* Daily progress monitoring and sprint reviews.
* Continuous Integration using GitHub Actions.

#### Quality Assurance Process

* Requirement validation before development.
* Code reviews and adherence to coding standards.
* Input validation and exception handling.
* Secure authentication and authorization using JWT.
* Continuous testing during every sprint.
* Final end-to-end testing before deployment.
* Performance optimization and post-deployment monitoring.



