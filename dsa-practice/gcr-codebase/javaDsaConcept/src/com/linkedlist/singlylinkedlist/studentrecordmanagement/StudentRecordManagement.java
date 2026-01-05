package com.linkedlist.singlylinkedlist.studentrecordmanagement;

class StudentNode {
    int rollNumber;
    String name;
    int age;
    char grade;
    StudentNode next;

    public StudentNode(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentRecordManagement {

    private StudentNode head;

    // Insert at beginning
    public void insertAtBeginning(int rollNumber, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
        System.out.println(" Student inserted at beginning");
    }

    // Insert at end
    public void insertAtEnd(int rollNumber, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);

        if (head == null) {
            head = newNode;
            System.out.println(" Student inserted as first record");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        System.out.println(" Student inserted at end");
    }

    // Insert at specific position
    public void insertAtPosition(int position, int rollNumber, String name, int age, char grade ) {
        if (position == 1) {
            insertAtBeginning(rollNumber, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println(" Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println(" Student inserted at position " + position);
    }

    // Display a single student
    public void displayNode(StudentNode s) {
        System.out.println("Roll No : " + s.rollNumber);
        System.out.println("Name    : " + s.name);
        System.out.println("Age     : " + s.age);
        System.out.println("Grade   : " + s.grade);
        System.out.println("----------------------------------");
    }

    // Display all students
    public void displayAll() {
        if (head == null) {
            System.out.println(" No student records available");
            return;
        }

        StudentNode temp = head;
        System.out.println("\n Student Records:");
        while (temp != null) {
            displayNode(temp);
            temp = temp.next;
        }
    }

    // Search student by roll number
    public void searchStudent(int rollNumber) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("\n Student Found:");
                displayNode(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println(" Student with roll number " + rollNumber + " not found");
    }

    // Update student grade
    public void updateGrade(int rollNumber, char grade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = grade;
                System.out.println(" Grade updated successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println(" Student not found");
    }

    // Delete student by roll number
    public void delete(int rollNumber) {

        if (head == null) {
            System.out.println(" No student records to delete");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println(" Student with roll number " + rollNumber + " deleted");
            return;
        }

        StudentNode temp = head;

        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(" Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println(" Student with roll number " + rollNumber + " deleted");
        }
    }

    public static void main(String[] args) {
        StudentRecordManagement s = new StudentRecordManagement();

        s.insertAtBeginning(1, "Abhay", 22, 'A');
        s.insertAtPosition( 2,2, "Shifa", 19, 'B');
        s.insertAtPosition(3, 3, "Aman", 21, 'F');
        s.insertAtEnd(4, "Tepra", 22, 'C');

        s.delete(3);
        s.updateGrade(3, 'B');
        s.searchStudent(1);
        s.displayAll();
        
        s.searchStudent(3);
    }
}
