/*
13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

import java.util.Scanner;

public class SandeepFitness {

    // This method records Sandeep's daily push-ups for one week
    // It calculates and displays total and average push-ups
    public static void fitnessRecord() {

        // Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=================================");
        System.out.println("        SANDEEP FITNESS TRACKER");
        System.out.println("=================================");

        // Array to store push-ups count for 7 days
        int pushups[] = new int[7];

        // Taking daily input from the user
        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + " - Enter push-ups: ");
            pushups[i] = scanner.nextInt();
        }

        // Variable to calculate total push-ups
        int totalPushups = 0;

        // Loop to calculate weekly total
        for (int i = 0; i < 7; i++) {
            totalPushups += pushups[i];
        }

        // Calculating average push-ups per day
        int averagePushups = totalPushups / 7;

        // Displaying the summary in a clean format
        System.out.println("\n---------------------------------");
        System.out.println("         WEEKLY FITNESS SUMMARY");
        System.out.println("---------------------------------");
        System.out.println("Total push-ups this week : " + totalPushups);
        System.out.println("Average push-ups per day : " + averagePushups);
        System.out.println("---------------------------------");
        
    }

    // Main method 
    public static void main(String[] args) {

        // Calling the fitness record method
        fitnessRecord();
    }
}
