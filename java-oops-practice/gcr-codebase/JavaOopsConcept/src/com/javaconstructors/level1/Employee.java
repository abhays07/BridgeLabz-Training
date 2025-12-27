package com.javaconstructors.level1;

//Creating Employee class
public class Employee {

// Public variable (can be accessed anywhere)
public int employeeID;

// Protected variable (can be accessed in subclass)
protected String department;

// Private variable (data hiding)
private double salary;

// Constructor to initialize employee details
public Employee(int employeeID, String department, double salary) {
   this.employeeID = employeeID;
   this.department = department;
   this.salary = salary;
}

// Public method to get salary
public double getSalary() {
   return salary;
}

// Public method to modify salary
public void setSalary(double salary) {
   this.salary = salary;
}
}


