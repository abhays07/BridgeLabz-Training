package com.javaconstructors.level1;

//Creating Student class
public class Student {

// Public variable (accessible everywhere)
public int rollNumber;

// Protected variable (accessible within package and subclass)
protected String name;

// Private variable (accessible only within this class)
private double CGPA;

// Constructor to initialize roll number and name
Student(int rollNumber, String name, double CGPA) {
   this.rollNumber = rollNumber;
   this.name = name;
   this.CGPA = CGPA;
}

// Public method to access (get) CGPA
public double getCGPA() {
   return CGPA;
}

// Public method to modify (set) CGPA
public void setCGPA(double CGPA) {
   this.CGPA = CGPA;
}

// Method to display student details
public void displayStudentDetails() {
   System.out.println("Roll Number : " + rollNumber);
   System.out.println("Name        : " + name);
   System.out.println("CGPA        : " + CGPA);
}
}
