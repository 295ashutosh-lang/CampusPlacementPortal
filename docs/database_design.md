# Database Design

## Overview

The Campus Placement Portal uses **MongoDB**, a NoSQL document database, to store application data. The database consists of collections representing users, students, companies, jobs, and job applications. Relationships between collections are maintained using unique document IDs.

---

## Collections

### Users

| Field     | Data Type | Constraints               |
| --------- | --------- | ------------------------- |
| _id       | ObjectId  | Primary Key               |
| fullName  | String    | Required                  |
| email     | String    | Required, Unique          |
| password  | String    | Required (Encrypted)      |
| role      | String    | Student / Company / Admin |
| createdAt | Date      | Auto Generated            |

---

### Students

| Field     | Data Type | Constraints      |
| --------- | --------- | ---------------- |
| _id       | ObjectId  | Primary Key      |
| userId    | ObjectId  | References Users |
| branch    | String    | Required         |
| semester  | Integer   | Required         |
| cgpa      | Decimal   | Range: 0 - 10    |
| skills    | Array     | Optional         |
| resumeURL | String    | Optional         |
| phone     | String    | Required         |

---

### Companies

| Field       | Data Type | Constraints      |
| ----------- | --------- | ---------------- |
| _id         | ObjectId  | Primary Key      |
| userId      | ObjectId  | References Users |
| companyName | String    | Required         |
| industry    | String    | Required         |
| website     | String    | Optional         |
| hrName      | String    | Required         |
| location    | String    | Required         |

---

### Jobs

| Field       | Data Type | Constraints          |
| ----------- | --------- | -------------------- |
| _id         | ObjectId  | Primary Key          |
| companyId   | ObjectId  | References Companies |
| jobTitle    | String    | Required             |
| description | String    | Required             |
| eligibility | String    | Required             |
| package     | Decimal   | Required             |
| deadline    | Date      | Required             |
| status      | String    | Open / Closed        |

---

### Applications

| Field       | Data Type | Constraints                                 |
| ----------- | --------- | ------------------------------------------- |
| _id         | ObjectId  | Primary Key                                 |
| studentId   | ObjectId  | References Students                         |
| jobId       | ObjectId  | References Jobs                             |
| appliedDate | Date      | Auto Generated                              |
| status      | String    | Applied / Shortlisted / Rejected / Selected |

---

## Collection Relationships

```text
Users
│
|─ Student (1 : 1)
│
└── Company (1 : 1)

Company (1) ───────────>(Many) Jobs

Student (1) ───────────>(Many) Applications

Job (1) ───────────────>(Many) Applications
```

---

## Validation Rules

* Email must be unique.
* Passwords are encrypted using BCrypt.
* CGPA must be between **0.0 and 10.0**.
* Job deadline cannot be a past date.
* A student can apply only once for the same job.
* Only authenticated users can access protected collections.

