## 📘 Java Collections

### 🔹 Week 1 – Day 1: Java Generics (Scenario-Based)

**Branch:** `java-collections`

* Solved **real-world, scenario-based Java programs** using **Generics**
* Practiced **generic classes, generic methods, bounded type parameters, and wildcards**
* Built type-safe and reusable solutions across multiple domains

**Problems Solved**

* **Smart Warehouse Management System** – Bounded generic storage with wildcard display
* **Dynamic Online Marketplace** – Generic product catalog with dynamic discount application
* **Multi-Level University Course Management System** – Generic course handler with wildcards
* **Personalized Meal Plan Generator** – Generic meal plan validation and generation
* **AI-Driven Resume Screening System** – Wildcard-driven resume screening pipeline

🔗 **Code Link (Week 1 – Day 1):**
👉 [https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/generics](https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/generics)

---

## 📘 Java Collections – Week 1 Day 2

### 🔹 Collections Framework: List, Set, Queue & Map Interfaces

**Branch:** `java-collections`

Worked on **core Java Collections Framework** by solving **problem-oriented and real-world scenario-based questions**, focusing on **List, Set, Queue, and Map interfaces** and their practical use cases.

---

### 📌 List Interface Problems

* Reversed elements of a list without using built-in reverse methods (ArrayList & LinkedList)
* Counted frequency of elements using Map
* Rotated list elements by a given position
* Removed duplicates while preserving insertion order
* Found the Nth element from the end of a LinkedList using two-pointer logic

---

### 📌 Set Interface Problems

* Checked equality of two sets regardless of order
* Computed union, intersection, and symmetric difference
* Converted HashSet into a sorted list
* Verified subset relationships between sets

---

### 📌 Insurance Policy Management System (Set-Based)

* Managed unique insurance policies using:

  * `HashSet` for fast lookup
  * `LinkedHashSet` for insertion order
  * `TreeSet` for sorting by expiry date
* Retrieved:

  * All unique policies
  * Policies expiring within 30 days
  * Policies by coverage type
  * Duplicate policies by policy number
* Compared performance of different Set implementations

---

### 📌 Queue Interface Problems

* Reversed a queue using only queue operations
* Generated first N binary numbers using a queue
* Simulated hospital triage using `PriorityQueue`
* Implemented a stack using two queues
* Built a circular buffer using a fixed-size queue

---

### 📌 Map Interface Problems

* Word frequency counter using `HashMap`
* Inverted a map while handling duplicate values
* Found key with maximum value
* Merged two maps by summing values
* Grouped employee objects by department

---

### 📌 Real-World Map-Based Systems

* **Insurance Policy Management System**

  * `HashMap`, `LinkedHashMap`, `TreeMap` usage
  * Policy retrieval, expiry filtering, cleanup
* **Voting System**

  * HashMap for vote counting
  * TreeMap for sorted results
  * LinkedHashMap for vote order
* **Shopping Cart**

  * HashMap for prices
  * LinkedHashMap for insertion order
  * TreeMap for price-based sorting
* **Banking System**

  * HashMap for accounts
  * TreeMap for balance sorting
  * Queue for withdrawal processing

---

### 🔗 Code Link (Week 1 – Day 2)

👉 [https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/generics](https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/generics)

---

## 📅 Week 1 – Day 3: Java I/O Streams & File Handling

**Branch:** `java-collections`

### 🧪 Problems Solved

* **File Handling – Read & Write Text Files**
  Read contents from a source file and wrote them into a new file using `FileInputStream` and `FileOutputStream`, with proper exception handling.

* **Buffered Streams – Efficient File Copy**
  Copied a large file using `BufferedInputStream` and `BufferedOutputStream`, measured performance with `System.nanoTime()`, and compared against unbuffered streams.

* **Read User Input & Save to File**
  Collected user details from console input using `BufferedReader` and wrote them to a file using `FileWriter`.

* **Serialization – Save & Retrieve Objects**
  Serialized a list of `Employee` objects to a file and then deserialized them using object streams.

* **ByteArray Streams – Image Conversion**
  Converted an image to a byte array using `ByteArrayInputStream`/`ByteArrayOutputStream` and recreated the image file.

* **Filter Streams – Uppercase to Lowercase Conversion**
  Read a text file and wrote its contents to another file with uppercase converted to lowercase using buffered character streams.

* **Data Streams – Primitive Data I/O**
  Stored and retrieved student primitive data using `DataOutputStream` and `DataInputStream`.

* **Piped Streams – Inter-Thread Communication**
  Implemented two-thread communication using `PipedOutputStream` and `PipedInputStream`.

* **Large File Line-by-Line Reader**
  Efficiently read a large text file line by line, printing only lines containing a specific keyword.

* **Word Frequency Counter**
  Counted word occurrences in a text file using a `HashMap` and displayed the top 5 most frequent words.

---

### 🔗 Code Link (Week 1 – Day 3)

👉 [https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/javastreams](https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/javastreams)

---

## 📅 Week 1 – Day 4: Exception Handling in Java (Scenario-Based Practice)

**Branch:** `java-collections`

Practiced **core Java exception handling** through practical, real-world problems focusing on controlled error handling and robust program behavior.

### 🧪 Problems Solved

* **Checked Exception – File Reading**
  Read a text file and handled `IOException` with user-friendly messaging when the file doesn’t exist.

* **Unchecked Exceptions – Safe Division**
  Performed division with user input while handling `ArithmeticException` and `InputMismatchException`.

* **Custom Exception – Age Validation**
  Created and used `InvalidAgeException` to enforce age-based validation rules.

* **Multiple Catch Blocks**
  Safely accessed array elements with handling for `ArrayIndexOutOfBoundsException` and `NullPointerException`.

* **Try-with-Resources**
  Used automatic resource management to read a file’s first line.

* **throw vs throws**
  Implemented and propagated invalid input scenarios for financial calculations.

* **finally Block Usage**
  Demonstrated `finally` execution regardless of exception occurrence.

* **Exception Propagation Across Methods**
  Showed a thrown exception moving through multiple method layers and handled in `main()`.

* **Nested try-catch Blocks**
  Combined index access and division error handling using nested exception handling.

* **Bank Transaction System**
  Combined checked and custom exceptions to support withdrawal operations with multiple failure modes.

---

### 🔗 Code Link

👉 [https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/exceptions](https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/exceptions)

---

## 📅 Week 1 – Day 5: Regular Expressions & JUnit Testing

**Branch:** `java-collections`

Worked on **string pattern matching using Java Regex** and **unit testing with JUnit**, focusing on validation, extraction, replacement, and automated test coverage.

---

### 🧪 Java Regex – Practice Problems

Implemented multiple **regex-based validation, extraction, and transformation tasks**, including:

* Username, license plate, hex color, IP address, credit card, and SSN validation
* Extracting emails, dates, URLs, currency values, programming language names
* Identifying capitalized words and repeating words
* Replacing multiple spaces and censoring bad words using patterns

🔗 **Code Link (Regex):**
👉 [https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/regex](https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/regex)

---

### 🧪 JUnit – Unit Testing Practice

Created **JUnit test cases** to validate core logic, exception handling, performance, and file operations:

* Calculator operations and division-by-zero testing
* String utility method testing (reverse, palindrome, uppercase)
* List operations (add, remove, size validation)
* Exception testing using `assertThrows`
* Lifecycle testing using `@BeforeEach` and `@AfterEach`
* Parameterized tests for multiple inputs
* Timeout-based performance testing
* File read/write testing with exception handling
* Advanced testing for banking, password validation, temperature conversion, date formatting, and user registration

🔗 **Code Link (JUnit):**
👉 [https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/junit](https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/junit)

---

### 🔹 Week 1 – Day 6: Reflection & Annotations in Java

**Branch:** `java-collections`

Worked on **Java Reflection API** and **Annotations**, covering basic to advanced use cases including runtime inspection, dynamic invocation, custom annotations, and annotation-driven behavior.

---

### 🧪 Java Reflection – Practice Problems

**Basic Level**

* Retrieved class metadata (fields, methods, constructors) dynamically
* Accessed and modified private fields using Reflection
* Invoked private methods at runtime
* Created objects dynamically without using `new`

**Intermediate Level**

* Dynamically invoked methods based on user input
* Retrieved custom annotations at runtime
* Accessed and modified private static fields

**Advanced Level**

* Implemented a custom object mapper using Reflection
* Generated JSON-like representation of objects dynamically
* Built dynamic logging proxy using Reflection
* Implemented simple dependency injection using annotations
* Measured method execution time dynamically

🔗 **Code Link (Reflection):**
👉 [https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/reflection](https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/reflection)

---

### 🧪 Java Annotations – Practice Problems

* Used built-in annotations:

  * `@Override`
  * `@Deprecated`
  * `@SuppressWarnings`
* Created and applied custom annotations:

  * `@TaskInfo`
  * `@BugReport` (Repeatable)
  * `@ImportantMethod`
  * `@Todo`
* Retrieved annotation metadata using Reflection
* Implemented annotation-driven features:

  * Execution time logging
  * Field validation using `@MaxLength`
  * Role-based access control using `@RoleAllowed`
  * Custom JSON serialization using `@JsonField`
  * Method result caching using `@CacheResult`

🔗 **Code Link (Annotations):**
👉 [https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/annotations](https://github.com/abhays07/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/annotations)

---

