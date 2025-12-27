package com.javaconstructors.level1;

//Creating subclass Manager
class Manager extends Employee {

String designation;

//Constructor of Manager class
public Manager(int employeeID, String department,
            double salary, String designation) {
 super(employeeID, department, salary);
 this.designation = designation;
}

//Method to display manager details
public void displayManagerDetails() {

 // Accessing public variable
 System.out.println("Employee ID : " + employeeID);

 // Accessing protected variable
 System.out.println("Department  : " + department);

 // Accessing private variable using getter
 System.out.println("Salary      : ₹" + getSalary());

 System.out.println("Designation : " + designation);
}

//Main method
public static void main(String[] args) {

 // Creating Manager object
 Manager m = new Manager(
         101,
         "IT",
         60000.0,
         "Project Manager"
 );
 // Modifying salary using public method
 m.setSalary(70000.0);

 // Displaying manager details
 m.displayManagerDetails();
}
}

