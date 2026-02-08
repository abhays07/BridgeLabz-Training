# 🚀 BridgeLabz Training – Java Design Patterns Practice

---

## 📅 Week 1 – Day 1: GoF Design Patterns – Smart University Library Management System

**Branch:** `java-design-patterns-practice`

Worked on a **real-world, story-driven case study** to understand how multiple **GoF Design Patterns** can coexist and collaborate inside a single enterprise-level application.

The case study models a **Smart University Library Management System**, focusing on scalability, flexibility, and clean object-oriented design.

---

### 📌 Scenario Overview

The university library required a centralized, extensible system to manage:

* A single global book catalog
* Dynamic user creation based on roles
* Automatic notifications for new book arrivals
* Flexible construction of complex book objects

To achieve this, multiple **GoF patterns** were integrated together.

---

### 🔹 Design Patterns Implemented

#### **Singleton Pattern – Centralized Library Catalog**

* Ensured only **one instance** of `LibraryCatalog` exists across the system
* Maintains a single source of truth for all books
* Prevents data inconsistency across multiple users and devices

#### **Factory Pattern – Dynamic User Creation**

* Created different user types at runtime:

  * Student
  * Faculty
  * Librarian
* Encapsulated object creation logic using `UserFactory`
* Enabled easy extension for future user roles (e.g., Guest)

#### **Observer Pattern – Notification System**

* Allowed users to **subscribe** to catalog updates
* Automatically notified all observers when a new book is added
* Supported multiple users listening to the same catalog events

#### **Builder Pattern – Flexible Book Construction**

* Constructed `Book` objects with:

  * Mandatory attributes (title)
  * Optional attributes (author, edition, genre)
* Avoided telescoping constructors
* Improved readability and maintainability

---

### 🔹 Integrated Application Flow

* Users are created dynamically using **Factory**
* Users subscribe to the catalog using **Observer**
* Books are constructed step-by-step using **Builder**
* Adding a book to the **Singleton catalog** triggers automatic notifications

---

### 🔗 Code Link

👉 Smart University Library Management System
[https://github.com/abhays07/BridgeLabz-Training/tree/java-design-patterns-practice/java-design-patterns-practice/design-patterns/gcr-codebase/javaDesignPatternsConcept/src/com/smartuniversitymanagementsystem](https://github.com/abhays07/BridgeLabz-Training/tree/java-design-patterns-practice/java-design-patterns-practice/design-patterns/gcr-codebase/javaDesignPatternsConcept/src/com/smartuniversitymanagementsystem)

---
