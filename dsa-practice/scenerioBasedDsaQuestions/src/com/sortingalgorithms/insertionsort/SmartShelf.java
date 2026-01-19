package com.sortingalgorithms.insertionsort;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartShelf {

    /*
     * This method sorts the list of book titles alphabetically using Insertion Sort.
     * Insertion Sort works well here because:
     * - Books are added one at a time
     * - The list is usually already almost sorted
     * - Sorting happens in real time without extra memory
     */
    public static void insertionSort(ArrayList<String> books) {

        // Start from the second book because the first book is already "sorted"
        for (int i = 1; i < books.size(); i++) {

            // Store the current book title that needs to be placed correctly
            String currentBook = books.get(i);

            // Index of the last book in the sorted portion
            int j = i - 1;

            /*
             * Move books one position to the right if they come
             * alphabetically after the current book.
             * compareToIgnoreCase ensures sorting is case-insensitive.
             */
            while (j >= 0 && books.get(j).compareToIgnoreCase(currentBook) > 0) {
                books.set(j + 1, books.get(j));
                j--;
            }

            // Place the current book at its correct position
            books.set(j + 1, currentBook);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();

        System.out.println("Digital Library Book Organizer");
        System.out.println("Enter book titles one by one");
        System.out.println("Type 'stop' to finish adding books");

        // Continuously accept book titles until the user types "stop"
        while (true) {
            System.out.print("Enter the name of the book: ");
            String title = sc.nextLine().trim();

            // Stop input when user types "stop"
            if (title.equalsIgnoreCase("stop")) {
                break;
            }

            // Avoid adding empty book names
            if (!title.isEmpty()) {
                books.add(title);
            }
        }

        // Display books in the order they were added
        System.out.println("\nBooks before sorting:");
        System.out.println(books);

        // Sort books alphabetically using insertion sort
        insertionSort(books);

        // Display sorted book list
        System.out.println("\nBooks after alphabetical sorting:");
        System.out.println(books);

        sc.close();
    }
}
