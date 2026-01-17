package com.sortingalgorithms.bubblesort;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalQueue {

    /**
     * Bubble Sort method to sort patients by criticality level
     * Lower number = higher priority (1 is most critical)
     * Sorting is done in-place
     */
    public static void bubbleSort(ArrayList<Integer> priority) {

        int n = priority.size();

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for adjacent comparisons
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if current patient is less critical than next
                if (priority.get(j) > priority.get(j + 1)) {

                    int temp = priority.get(j);
                    priority.set(j, priority.get(j + 1));
                    priority.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> priority = new ArrayList<>();

        System.out.println("Apollo Hospital - ER Patient Queue System");
        System.out.println("Enter patient criticality levels (1 = most critical, 10 = least critical)");
        System.out.println("------------------------------------------------");

        int count = 10;

        // Input with validation
        while (count > 0) {
            System.out.print("Enter criticality level for patient " 
                              + (11 - count) + ": ");

            int level = sc.nextInt();

            // Validate input range
            if (level < 1 || level > 10) {
                System.out.println(" Invalid input! Please enter a value between 1 and 10.");
                continue;
            }

            priority.add(level);
            count--;
        }

        // Display before sorting
        System.out.println("\nQueue before sorting (Arrival Order):");
        System.out.println(priority);

        // Sorting patients by criticality
        bubbleSort(priority);

        // Display after sorting
        System.out.println("\nQueue after sorting (By Criticality):");
        System.out.println(priority);

        System.out.println("\nPatients with lower numbers will be treated first.");
        sc.close();
    }
}
