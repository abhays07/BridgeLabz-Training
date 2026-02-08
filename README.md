# 🚀 Java 8 Programming Practice

## 📅 Week 1 – Day 1: Lambda Expressions & Method References

**Branch:** `java8-programming-practice`

Worked on **Java 8 functional programming concepts**, focusing on **Lambda Expressions** and **Method References** through **real-world, scenario-based problems**. Emphasis was on reducing boilerplate code, improving readability, and implementing behavior-driven logic using functional interfaces.

---

### 🧪 Scenario-Based Problems Implemented

#### 🔹 Lambda Expressions

* **Smart Home Lighting Automation**

  * Implemented dynamic light activation behaviors (motion detection, time-based triggers, voice commands) using lambda expressions without creating multiple concrete classes.

* **Custom Sorting in E-Commerce**

  * Applied lambda expressions with `Comparator` to sort products dynamically based on price, rating, and discount during sales campaigns.

* **Notification Filtering**

  * Used lambda expressions with `Predicate` to filter hospital notifications based on user-defined alert preferences.

---

#### 🔹 Method References

* **Hospital Patient ID Printing**

  * Printed patient IDs using method references to simplify iteration logic.

* **Employee Name Uppercasing**

  * Converted employee names to uppercase using `String::toUpperCase` within Java Streams.

* **Invoice Object Creation**

  * Used constructor references to dynamically generate invoice objects from transaction IDs.

---

### 🔗 Code Links

👉 **Lambda Expressions:**
[https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/javaEightConcept/src/com/lambdaexpressions](https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/javaEightConcept/src/com/lambdaexpressions)

👉 **Method References:**
[https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/javaEightConcept/src/com/methodreference](https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/javaEightConcept/src/com/methodreference)

---

## 📅 Week 1 – Day 2: Interfaces, Functional Interfaces & Advanced Interface Features

**Branch:** `java8-programming-practice`

Worked on **interface-driven design and Java 8 interface enhancements**, focusing on clean abstraction, backward compatibility, and functional-style programming.

---

### 🔹 Interface-Based Design

* **Smart Device Control Interface**
  Implemented a common interface for devices like Light, AC, and TV with `turnOn()` and `turnOff()` behaviors.

* **Multi-Vehicle Rental System**
  Designed an interface-based rental workflow for Car, Bike, and Bus using shared `rent()` and `returnVehicle()` methods.

* **Digital Payment Interface**
  Unified payment processing across UPI, Credit Card, and Wallet using a common `pay()` contract.

---

### 🔹 Functional Interfaces (Java 8)

* **Temperature Alert System**
  Used `Predicate<Double>` to trigger alerts when temperature crosses a threshold.

* **String Length Checker**
  Applied `Function<String, Integer>` to evaluate message length constraints.

* **Background Job Execution**
  Implemented asynchronous task execution using the `Runnable` functional interface.

---

### 🔹 Static Methods in Interfaces

* **Password Strength Validator**
  Centralized password policy validation using static interface methods.

* **Unit Conversion Tool**
  Implemented standard unit conversions (km→miles, kg→lbs) as static utilities.

* **Date Format Utility**
  Provided reusable date formatting logic through static interface methods.

---

### 🔹 Default Methods in Interfaces

* **Payment Gateway Integration**
  Added a default `refund()` method to support new functionality without breaking existing implementations.

* **Data Export Feature**
  Introduced `exportToJSON()` as a default method to extend export formats seamlessly.

* **Smart Vehicle Dashboard**
  Used default methods to extend vehicle dashboards with battery status for electric vehicles.

---

### 🔹 Marker Interfaces

* **Data Serialization for Backup**
  Marked classes eligible for backup processing using a marker interface.

* **Cloning Prototype Objects**
  Used `Cloneable` to support object cloning workflows.

* **Sensitive Data Tagging**
  Created a custom marker interface to identify data requiring encryption.

---

### 🔗 Code Link

👉 [https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/javaEightConcept/src/com/interfaces](https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/javaEightConcept/src/com/interfaces)

---

## 📅 Week 1 – Day 3: Stream API & forEach() in Real-World Scenarios

**Branch:** `java8-programming-practice`

Worked on **Java 8 Stream API and forEach()** to process, filter, transform, and analyze collections using a functional and declarative approach.

---

### 🔹 Stream API – Scenario-Based Problems

* **Top 5 Trending Movies**
  Filtered and sorted a large movie list by rating and release year, then selected the top 5 using `filter()`, `sorted()`, and `limit()`.

* **Hospital Doctor Availability**
  Identified doctors available on weekends and sorted them by specialty using streams.

* **Insurance Claim Analysis**
  Calculated the average claim amount per claim type using `groupingBy()` and `averagingDouble()`.

* **Filtering Expiring Memberships**
  Filtered gym members whose memberships expire within the next 30 days using date-based stream filtering.

* **Transforming Names for Display**
  Converted customer names to uppercase using `map()` and displayed them alphabetically using `sorted()`.

---

### 🔹 forEach() Method – Practical Use Cases

* **Stock Price Logger**
  Printed live stock price updates using `forEach()`.

* **Event Attendee Welcome Message**
  Displayed personalized welcome messages for all attendees using `forEach()` with lambdas.

* **IoT Sensor Readings**
  Printed sensor readings above a defined threshold using streams combined with `forEach()`.

* **Email Notifications**
  Sent notification emails to a list of users using `forEach()`.

* **Transaction Logging**
  Logged transaction IDs with timestamps using `forEach()` and `LocalDateTime`.

---

### 🔗 Code Links

👉 Stream API:
[https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/javaEightConcept/src/com/streamapi](https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/javaEightConcept/src/com/streamapi)

👉 forEach():
[https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/javaEightConcept/src/com/foreach](https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/javaEightConcept/src/com/foreach)

---

## 📅 Week 1 – Day 4: Java 8 Collectors & Scenario-Based Stream Queries

**Branch:** `java8-programming-practice`

Worked on **Collectors API** and **real-time scenario-based Stream problems**, focusing on grouping, aggregation, summarization, and analytical queries using Java 8.

---

## 📌 Java 8 – Collectors Practice

Implemented multiple problems using **Collectors** to transform and aggregate data efficiently.

### 🧪 Problems Solved

* **Student Result Grouping**
  Grouped students by grade level and collected student names using `Collectors.groupingBy()`.

* **Word Frequency Counter**
  Analyzed a paragraph and counted word occurrences using `Collectors.toMap()`.

* **Order Revenue Summary**
  Calculated total order revenue per customer using `Collectors.summingDouble()`.

* **Employee Salary Categorization**
  Grouped employees by department and calculated **average salary per department** using
  `Collectors.groupingBy()` + `Collectors.averagingDouble()`.

* **Library Book Statistics**
  Generated **total pages, average pages, and maximum pages per genre** using
  `Collectors.summarizingInt()`.

🔗 **Code Link (Collectors):**
👉 [https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/javaEightConcept/src/com/collectors](https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/javaEightConcept/src/com/collectors)

---

## 📌 Java 8 – Scenario-Based Employee Analytics (Streams + Collectors)

Solved a **comprehensive real-time analytics problem** on employee data using Streams and Collectors.

### 🧪 Scenario Covered

Performed analytical queries on employee attributes such as **gender, department, salary, age, and experience**.

**Key Queries Implemented**

* Male vs Female employee count
* Department-wise employee listing and count
* Average age and salary by gender and department
* Highest, lowest, second/third highest & lowest paid employees
* Employees joined after 2015
* Most experienced employee
* Salary-based filtering (above 25k)
* Top 5 highest and lowest paid employees
* Total and average salary of the organization
* Youngest employee in a specific department

🔗 **Code Link (Scenario-Based Streams):**
👉 [https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenerioBasedQuestions/src/com/employeeinformation](https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenerioBasedQuestions/src/com/employeeinformation)

---

## 📅 Week 1 – Day 5: Java 8 Smart City Transport & Service Management (End-to-End Scenario)

**Branch:** `java8-programming-practice`

Worked on a **large-scale, real-world Java 8 scenario** that integrates **multiple Java 8 concepts into a single cohesive system** simulating a **Smart City Transport & Service Management Platform**.

---

## 🏙️ Smart City Transport & Service Management System

### 🔹 Scenario Overview

The City Council aims to build a unified system to manage **buses, metros, taxis, EV charging stations, and emergency services**, focusing on **real-time dashboards, extensibility, and performance** using modern Java 8 features.

---

### 🔹 Java 8 Concepts Applied (Scenario Mapping)

* **Lambda Expressions**

  * Filtered and sorted transport schedules based on user preferences such as **earliest departure** and **lowest fare**.

* **Method References**

  * Used for printing service details, logging activities, and invoking utility methods for fare calculations.

* **Default Methods in Interfaces**

  * `TransportService` interface defines default behavior like `printServiceDetails()` shared by all transport types.

* **Static Methods in Interfaces**

  * `GeoUtils.calculateDistance()` computes distance between locations without object instantiation.

* **Stream API**

  * Aggregated passenger data
  * Calculated revenue
  * Identified top-used routes
  * Generated analytics for dashboards

* **forEach()**

  * Displayed live transport schedules and active services on dashboards.

* **Collectors**

  * `groupingBy()` → Group passengers by route
  * `partitioningBy()` → Separate peak vs non-peak trips
  * `summarizingDouble()` → Total, average, and maximum fares collected

* **Functional Interfaces**

  * `FareCalculator` implemented using lambdas for dynamic fare computation.

* **Marker Interfaces**

  * `EmergencyService` identifies services that can bypass traffic rules (ambulance, fire service).

* **Interface-Based Design**

  * `TransportService` implemented by:

    * `BusService`
    * `MetroService`
    * `TaxiService`
  * Easily extensible to new services like **FerryService** or **BikeRentalService**.

---

### 🔄 Real-Time System Flow

1. Passenger books a trip → Lambda filters and sorts available services
2. Dashboard updates → `forEach()` displays live schedules
3. Revenue analytics → Streams + Collectors generate reports
4. System expansion → New services added via interfaces
5. Emergency handling → Marker interface prioritizes services

---

### 🔗 Code Link

👉 Smart City Transport System:
[https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenerioBasedQuestions/src/com/workshop/smartcitytransportandservicemanagement](https://github.com/abhays07/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenerioBasedQuestions/src/com/workshop/smartcitytransportandservicemanagement)

---


