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

```text
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

#### Activities, Duration, Responsibilities and Deliverables

| Phase                | Activities                                                                                                                                        | Duration | Person Responsible                | Deliverables                                                         |
| -------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | -------- | --------------------------------- | -------------------------------------------------------------------- |
| Requirement Analysis | Gather functional and non-functional requirements, identify stakeholders, define project scope, prepare Software Requirement Specification (SRS). | 3 Days   | Project Manager, Business Analyst | SRS Document, Requirement Specification                              |
| Project Planning     | Define milestones, estimate resources, prepare project schedule, select technology stack, perform feasibility analysis and risk assessment.       | 2 Days   | Project Manager                   | Project Plan, Work Breakdown Structure (WBS), Risk Assessment Report |
| System Design        | Design system architecture, database schema, REST APIs, user interface wireframes, security architecture and module interactions.                 | 4 Days   | System Architect, UI/UX Designer  | Architecture Diagram, ER Diagram, API Design Document, UI Wireframes |
| Development          | Develop frontend components, backend services, REST APIs, authentication module, database integration, dashboards and business logic.             | 15 Days  | Full Stack Developer              | Source Code, API Endpoints, Database Collections, Functional Modules |
| Testing              | Perform unit testing, integration testing, API testing, system testing, regression testing, bug fixing and validation of all modules.             | 5 Days   | QA Engineer                       | Test Cases, Bug Report, Test Execution Report                        |
| Deployment           | Configure production environment, deploy frontend and backend, configure MongoDB Atlas, implement CI/CD pipeline, verify production build.        | 2 Days   | DevOps Engineer                   | Live Application, Deployment Documentation, CI/CD Pipeline           |
| Maintenance          | Monitor application performance, resolve defects, optimize database queries, implement feature enhancements and perform security updates.         | Ongoing  | Development Team                  | Updated Releases, Performance Reports, Enhancement Documentation     |

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



