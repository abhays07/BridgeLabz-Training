# MySql JDBC Practice

---

## 📅 Week 1 – Day 1: JDBC-Based Console Applications with MySQL

**Branch:** `mysql-jdbc-practice`

Worked on **MySQL JDBC practice exercises** to understand **database connectivity, CRUD operations, transaction management, and real-world data handling** using Java and MySQL.
The focus was on building **console-based applications** that interact with a relational database using **JDBC best practices**.

---

## 📌 Practice Exercises Covered

### 🔹 Exercise 1: Simple CRUD Application – Employee Management System

Designed a **console-based Employee Management System** using JDBC with the following features:

* Add new employee records to the database
* View all employees from the database
* Update employee salary using employee ID or name
* Delete employee records
* Search employees by name

**Key Concepts Applied**

* JDBC connection handling
* `PreparedStatement` for safe SQL execution
* CRUD operations (INSERT, SELECT, UPDATE, DELETE)
* ResultSet processing

---

### 🔹 Exercise 2: Transaction Management – Banking System

Implemented a **banking system** focusing on **transaction handling**.

**Features Implemented**

* Transfer money between accounts using database transactions
* Check account balance
* Maintain and display transaction history

**Key Concepts Applied**

* JDBC transaction management (`commit`, `rollback`)
* Ensuring atomicity of fund transfers
* Handling failures and maintaining data consistency

---

### 🔹 Exercise 3: Advanced Features – Library Management System

Built a **Library Management System** with advanced database-driven features:

* Book inventory management
* Student borrowing and return records
* Fine calculation for late returns
* Search functionality using multiple filters (book name, author, student, etc.)

---

## 🔗 Code Link

👉 MySQL JDBC Practice Exercises
[https://github.com/abhays07/BridgeLabz-Training/tree/mysql-jdbc-practice/mysql-jdbc-practice/gcr-codebase/sqlPractice/src/com/mysqlpracticeexcercise](https://github.com/abhays07/BridgeLabz-Training/tree/mysql-jdbc-practice/mysql-jdbc-practice/gcr-codebase/sqlPractice/src/com/mysqlpracticeexcercise)

---

## 📅 Week 1 – Day 2: Hospital Management System (Scenario-Based JDBC Design)

**Branch:** `mysql-jdbc-practice`

Worked on a **comprehensive Hospital Management System** using **Java + MySQL (JDBC)**, focusing on real-world, scenario-based use cases covering patient care, doctor workflows, appointment scheduling, billing, and system administration.

---

## 🏥 Module 1: Patient Management

**UC-1.1: Register New Patient**
Receptionist registers a new patient by entering personal details. The system validates uniqueness using phone/email and generates a unique patient ID before inserting the record into the database.

**UC-1.2: Update Patient Information**
Patient details are retrieved using ID or phone number, displayed, and updated using SQL `UPDATE` operations.

**UC-1.3: Search Patient Records**
Patient records are searched using name, ID, or phone number with SQL `LIKE` and exact match queries.

**UC-1.4: View Patient Visit History**
Patient visit history is displayed using joined data from appointments and visits tables, ordered chronologically.

---

## 👨‍⚕️ Module 2: Doctor Management

**UC-2.1: Add Doctor Profile**
Administrator adds doctor profiles including specialization and consultation fees.

**UC-2.2: Assign / Update Doctor Specialty**
Doctor specialties are assigned or updated using lookup tables while maintaining referential integrity.

**UC-2.3: View Doctors by Specialty**
Doctors are listed by specialization using multi-table joins.

**UC-2.4: Deactivate Doctor Profile**
Doctor profiles are soft-deleted after verifying no upcoming appointments exist.

---

## 📅 Module 3: Appointment Scheduling

**UC-3.1: Book New Appointment**
Receptionist books appointments after checking doctor availability for a given date and time.

**UC-3.2: Check Doctor Availability**
Availability is calculated using appointment counts grouped by time slots.

**UC-3.3: Cancel Appointment**
Appointments are cancelled and logged in an audit table using transactional updates.

**UC-3.4: Reschedule Appointment**
Appointments are rescheduled with rollback support if slot conflicts occur.

**UC-3.5: View Daily Appointment Schedule**
Daily schedules are displayed using joins between patients, doctors, and appointments.

---

## 🧾 Module 4: Visit Management & Medical Records

**UC-4.1: Record Patient Visit**
Doctors record diagnoses, prescriptions, and notes after visit completion.

**UC-4.2: View Patient Medical History**
Complete medical history is retrieved using multi-table joins ordered by visit date.

**UC-4.3: Add Prescription Details**
Multiple prescriptions are inserted efficiently using batch JDBC operations.

---

## 💰 Module 5: Billing & Payments

**UC-5.1: Generate Bill for Visit**
Bills are generated using consultation fees and additional charges.

**UC-5.2: Record Payment**
Payments are recorded and linked with transaction logs using JDBC transactions.

**UC-5.3: View Outstanding Bills**
Unpaid bills are listed with patient summaries and aggregated totals.

**UC-5.4: Generate Revenue Report**
Revenue reports are generated using grouped aggregate queries with date filters.

---

## ⚙️ Module 6: System Administration

**UC-6.1: Manage Specialty Lookup**
Specialty reference data is maintained with safe delete checks.

**UC-6.2: Database Backup Trigger**
Scheduled JDBC operations export critical data using schema metadata validation.

**UC-6.3: View System Audit Logs**
Audit logs are queried based on user actions, tables, and timestamps.

---

## 🔗 Code Link

👉 Hospital Management System (Scenario-Based JDBC)
[https://github.com/abhays07/BridgeLabz-Training/tree/mysql-jdbc-practice/mysql-jdbc-practice/scenerio-based/scenerioBasedQuestions/src/com/hospitalmanagement](https://github.com/abhays07/BridgeLabz-Training/tree/mysql-jdbc-practice/mysql-jdbc-practice/scenerio-based/scenerioBasedQuestions/src/com/hospitalmanagement)

---
