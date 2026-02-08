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

## 📅 Week 1 – Day 2: Java Multi-Threading – Concepts, Lifecycle & Real-World Scenarios

**Branch:** `java-design-patterns-practice`

Worked on **core Java Multi-Threading concepts**, focusing on **thread creation, lifecycle management, thread states, and concurrent problem-solving** using real-world, scenario-based examples.

The objective was to understand **how threads behave, interact, and affect system performance**, while also identifying common pitfalls such as race conditions and improper thread handling.

---

## 📌 Topics Covered

### 🔹 Introduction to Multi-Threading

* Understanding threads as **lightweight processes**
* Benefits:

  * Better CPU utilization
  * Improved responsiveness
  * Resource sharing
  * True parallelism on multi-core systems
* Real-world use cases:

  * Web servers
  * Banking systems
  * Media players
  * Gaming engines

---

## 🔹 Thread Creation Techniques

### 1️⃣ Using **Thread Class**

* Created custom threads by extending `Thread`
* Overrode `run()` method
* Used `start()` to initiate concurrent execution
* Explored thread naming, sleep, and execution order

### 2️⃣ Using **Runnable Interface** (Recommended)

* Implemented `Runnable` for better design flexibility
* Enabled resource sharing between multiple threads
* Demonstrated:

  * Parameterized tasks
  * Shared resource access
  * Lambda-based thread creation (Java 8+)

---

## 🔹 Thread Lifecycle & States

Covered **all six thread states** defined in `Thread.State`:

* **NEW**
* **RUNNABLE**
* **BLOCKED**
* **WAITING**
* **TIMED_WAITING**
* **TERMINATED**

Implemented examples to:

* Observe real-time state transitions
* Monitor thread states dynamically
* Understand blocking, waiting, and timed waiting scenarios

---

## 🔹 Important Thread Methods

* `start()` vs `run()`
* `sleep()`
* `join()`
* `setPriority()`
* `getState()`

Understood how these methods influence:

* Execution order
* Thread coordination
* CPU scheduling behavior

---

## 🧪 Practice Problems Implemented (Scenario-Based)

### ✅ Problem 1: Download Manager

* Downloaded multiple files concurrently using threads
* Displayed progress percentage per file
* Ensured main thread waits until all downloads complete

### ✅ Problem 2: Banking System with Concurrent Transactions

* Simulated multiple ATM withdrawals
* Highlighted race conditions due to shared balance
* Demonstrated the **need for synchronization**

### ✅ Problem 3: Restaurant Order Processing System

* Multiple chef threads preparing dishes in parallel
* Displayed cooking progress (25%, 50%, 75%, 100%)
* Manager thread waited using `join()`

### ✅ Problem 4: Thread State Monitoring System

* Monitored thread states at regular intervals
* Displayed timestamps and state transitions
* Generated a summary of lifecycle states observed

### ✅ Problem 5: Print Shop Job Scheduler

* Multiple print jobs with different priorities
* Simulated printing time per page
* Demonstrated how **thread priority affects execution**

---

## 🔹 Key Learnings

* Difference between **Thread vs Runnable**
* Importance of **thread lifecycle awareness**
* Why `Runnable` is preferred in real applications
* How improper synchronization leads to data inconsistency
* Thread priorities are **hints**, not guarantees
* Debugging is easier with meaningful thread names

---

## 🔗 Code Link

👉 Java Multi-Threading Practice (Scenario-Based)
[https://github.com/abhays07/BridgeLabz-Training/tree/java-design-patterns-practice/java-design-patterns-practice/java-multithreading-practice/gcr-codebase/javaMultithreading/src/com/multithreading](https://github.com/abhays07/BridgeLabz-Training/tree/java-design-patterns-practice/java-design-patterns-practice/java-multithreading-practice/gcr-codebase/javaMultithreading/src/com/multithreading)

---

## 📅 Week 1 – Day 3: Scenario-Based Multi-Threading – Bank Transactions System

**Branch:** `java-design-patterns-practice`

Worked on a **scenario-based multi-threading problem** to understand **thread safety, synchronization, and concurrent data access** in Java through a real-world **Bank Transactions** use case.

The focus was on **preventing race conditions**, maintaining **data consistency**, and ensuring **correct account balances** when multiple customers perform transactions simultaneously.

---

## 📌 Scenario Overview

### 🏦 Bank Transactions – Concurrent Access Handling

A simple banking system was designed where:

* The bank maintains **multiple customer accounts**
* Each account has a balance
* Multiple customers perform **deposit and withdrawal operations concurrently**

The challenge was to ensure that **simultaneous transactions do not corrupt account data**.

---

## 🔹 Core Components Implemented

### 1️⃣ **Bank Class**

Implemented a central `Bank` class responsible for managing accounts and balances.

**Key Methods:**

* `deposit(int accountNumber, int amount)`
* `withdraw(int accountNumber, int amount)`
* `getBalance(int accountNumber)`

🔐 **Thread Safety Measures**

* Used **synchronization mechanisms** to protect critical sections
* Ensured atomic updates to account balances
* Prevented race conditions during concurrent deposits and withdrawals

---

### 2️⃣ **Customer Class**

* Each customer is represented as a **separate thread**
* Each customer has a unique customer ID
* Executes a sequence of deposit and withdrawal operations on an account
* Simulates real-world concurrent banking behavior

---

### 3️⃣ **Main / Driver Class**

* Created multiple `Customer` threads
* Started all customer threads concurrently
* Displayed:

  * Transaction execution sequence
  * Intermediate transaction logs
  * Final account balances after all threads completed

---

## 🧪 Demonstration Highlights

* Multiple customers depositing and withdrawing at the same time
* Correct balance maintained even under heavy concurrency
* Clear console output showing:

  * Which customer performed which transaction
  * Updated balances after each operation
  * Final verified balance after all threads finished

---

## 🔗 Code Link

👉 Scenario-Based Multi-Threading – Bank Transactions
[https://github.com/abhays07/BridgeLabz-Training/tree/java-design-patterns-practice/java-design-patterns-practice/java-multithreading-practice/scenerioBasedQuestions/src/com](https://github.com/abhays07/BridgeLabz-Training/tree/java-design-patterns-practice/java-design-patterns-practice/java-multithreading-practice/scenerioBasedQuestions/src/com)

---




