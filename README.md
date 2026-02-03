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

