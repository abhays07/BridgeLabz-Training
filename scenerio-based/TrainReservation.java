/*
12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/

import java.util.Scanner;

public class TrainReservation {

    // Variables to store available seats for each coach type
    static int acSeats = 80;
    static int sleeperSeats = 100;
    static int sittingSeats = 150;
    static int generalSeats = 200;

    // Variable to generate ticket numbers
    static int ticketNumber = 0;

    // Scanner object for user input throughout the program
    static Scanner sc = new Scanner(System.in);

    // Method to book a ticket based on coach selection
    public static void bookTicket() {

        System.out.println("\n------ BOOK TICKET ------");
        System.out.println("1. AC Coach");
        System.out.println("2. Sleeper Coach");
        System.out.println("3. Sitting Coach");
        System.out.println("4. General Coach");
        System.out.print("Choose your ticket option: ");

        int choice = sc.nextInt();
        int fare = 0;

        // Decide fare based on selected coach
        switch (choice) {
            case 1:
                fare = 2000;
                break;
            case 2:
                fare = 1500;
                break;
            case 3:
                fare = 1000;
                break;
            case 4:
                fare = 500;
                break;
            default:
                System.out.println("Invalid coach selection.");
                return;
        }

        // Display fare and ask for confirmation
        System.out.println("The fare for the selected coach is Rs. " + fare);
        System.out.print("Do you want to proceed with booking? (yes/no): ");
        String confirm = sc.next();

        // If user does not want to continue
        if (!confirm.equalsIgnoreCase("yes")) {
            System.out.println("Booking cancelled by user.");
            return;
        }

        // Proceed with booking after confirmation
        switch (choice) {

            case 1:
                if (acSeats > 0) {
                    ticketNumber++;
                    acSeats--;
                    System.out.println("AC Coach ticket booked successfully.");
                    System.out.println("Your ticket number is: " + ticketNumber);
                } else {
                    System.out.println("No seats available in AC Coach.");
                }
                break;

            case 2:
                if (sleeperSeats > 0) {
                    ticketNumber++;
                    sleeperSeats--;
                    System.out.println("Sleeper Coach ticket booked successfully.");
                    System.out.println("Your ticket number is: " + ticketNumber);
                } else {
                    System.out.println("No seats available in Sleeper Coach.");
                }
                break;

            case 3:
                if (sittingSeats > 0) {
                    ticketNumber++;
                    sittingSeats--;
                    System.out.println("Sitting Coach ticket booked successfully.");
                    System.out.println("Your ticket number is: " + ticketNumber);
                } else {
                    System.out.println("No seats available in Sitting Coach.");
                }
                break;

            case 4:
                if (generalSeats > 0) {
                    ticketNumber++;
                    generalSeats--;
                    System.out.println("General Coach ticket booked successfully.");
                    System.out.println("Your ticket number is: " + ticketNumber);
                } else {
                    System.out.println("No seats available in General Coach.");
                }
                break;
        }
    }


    // Method to cancel a ticket using ticket number
    public static void cancelTicket() {

        System.out.print("\nEnter ticket number to cancel: ");
        int userInput = sc.nextInt();

        // Basic validation for ticket number
        if (userInput > 0 && userInput <= ticketNumber) {
            System.out.println("Ticket cancelled successfully.");
            // For simplicity, one general seat is restored
            generalSeats++;
        } else {
            System.out.println("Invalid ticket number.");
        }
    }

    // Method to display fare details for each coach
    public static void fareEnquiry() {

        System.out.println("\n------ FARE DETAILS ------");
        System.out.println("AC Coach      : Rs. 2000");
        System.out.println("Sleeper Coach : Rs. 1500");
        System.out.println("Sitting Coach : Rs. 1000");
        System.out.println("General Coach : Rs. 500");
    }

    // Method to show available seats for all coaches
    public static void seatAvailability() {

        System.out.println("\n------ SEAT AVAILABILITY ------");
        System.out.println("AC Seats Available      : " + acSeats);
        System.out.println("Sleeper Seats Available : " + sleeperSeats);
        System.out.println("Sitting Seats Available : " + sittingSeats);
        System.out.println("General Seats Available : " + generalSeats);
    }

    // Main method controls the menu-driven execution
    public static void main(String[] args) {

        while (true) {

            System.out.println("\n==============================");
            System.out.println("       TRAIN TICKET SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Fare Enquiry");
            System.out.println("4. Seat Availability");
            System.out.println("5. Exit");
            System.out.print("Choose your action: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bookTicket();
                    break;

                case 2:
                    cancelTicket();
                    break;

                case 3:
                    fareEnquiry();
                    break;

                case 4:
                    seatAvailability();
                    break;

                case 5:
                    System.out.println("Thank you for using the Train Reservation System.");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
