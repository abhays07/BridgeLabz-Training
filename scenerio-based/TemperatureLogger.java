/*
11. Temperature Logger 🌡️
--------------------------------
• Records temperatures for 7 days
• Uses array and for-loop
• Calculates average temperature
• Finds maximum temperature
• Uses if-condition for comparison
• Clean naming + modular structure
*/

import java.util.*;

public class TemperatureLogger {

    // Scanner declared at class level so it can be used inside methods
    static Scanner sc = new Scanner(System.in);

    // Method to record, calculate, and display temperature details
    public static void temperatureRecord() {

        // Array to store temperatures of 7 days
        double[] temperatures = new double[7];

        System.out.println("\n====================================");
        System.out.println("          WEEKLY TEMPERATURE LOG");
        System.out.println("====================================");

        // Taking temperature input for each day
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter temperature for Day " + (i + 1) + " : ");
            temperatures[i] = sc.nextDouble();
        }

        // Calculate total sum of temperatures
        double totalSum = 0;
        for (int i = 0; i < 7; i++) {
            totalSum += temperatures[i];
        }

        // Calculate average temperature
        double averageTemperature = totalSum / 7;

        // Find maximum temperature
        double maxTemperature = Double.MIN_VALUE;
        for (int i = 0; i < 7; i++) {
            if (temperatures[i] > maxTemperature) {
                maxTemperature = temperatures[i];
            }
        }

        // Display final results
        System.out.println("\n----------- WEEKLY SUMMARY -----------");
        System.out.println(" Maximum Temperature : " + maxTemperature + " °C");
        System.out.println(" Average Temperature : " + averageTemperature + " °C");
        System.out.println("-------------------------------------\n");
    }

    public static void main(String[] args) {

        // Program entry point
        temperatureRecord();

    }
}
