package com.smartuniversitymanagementsystem;

import java.util.Arrays;



public class Main {

    public static void main(String[] args) {

        // Factory Pattern
        Users student = UserFactory.createUser("student");
        student.functionality();

        // Singleton Catalog
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Observer Pattern
        catalog.registerObserver(new StudentObserver("Abhay"));
        catalog.registerObserver(new FacultyObserver("Dr. Rao"));

        // Builder Pattern
        Book book = new Book.BookBuilder("Data Structures by Cormen")
                .authors(Arrays.asList("Cormen", "Leiserson"))
                .edition("3rd Edition")
                .genre("Computer Science")
                .publisher("MIT Press")
                .build();

        catalog.addBook(book);
        
    }
}