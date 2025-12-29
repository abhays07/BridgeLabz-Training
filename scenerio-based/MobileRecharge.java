/*
10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/

import java.util.Scanner;

public class MobileRecharge {

    public static void performMobileRecharge() {

        Scanner sc = new Scanner(System.in);
        double balance = 0.0;

        while (true) {

            System.out.println("\n--------------------------------------");
            System.out.println("        MOBILE RECHARGE SYSTEM");
            System.out.println("--------------------------------------");
            System.out.println("Choose Your Operator:");
            System.out.println("1 : Jio");
            System.out.println("2 : Airtel");
            System.out.println("3 : BSNL");
            System.out.println("4 : Vi");
            System.out.println("5 : Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                sc.next();
                continue;
            }

            int operator = sc.nextInt();

            if (operator == 5) {
                System.out.println("Thank you for using the Mobile Recharge Service.");
                break;
            }

            int amount = 0;

            System.out.println("\nAvailable Offers:");

            switch (operator) {

                case 1: // Jio
                    System.out.println("1 : ₹149  - 1GB/day for 20 days");
                    System.out.println("2 : ₹199  - 1.5GB/day for 28 days");
                    System.out.println("3 : ₹299  - 2GB/day for 28 days");
                    System.out.println("4 : ₹666  - 1.5GB/day for 84 days");
                    break;

                case 2: // Airtel
                    System.out.println("1 : ₹179  - 1GB/day for 28 days");
                    System.out.println("2 : ₹265  - 1.5GB/day for 28 days");
                    System.out.println("3 : ₹399  - 2.5GB/day for 28 days");
                    System.out.println("4 : ₹719  - 1.5GB/day for 84 days");
                    break;

                case 3: // BSNL
                    System.out.println("1 : ₹107  - 3GB total, 35 days");
                    System.out.println("2 : ₹187  - 2GB/day for 28 days");
                    System.out.println("3 : ₹397  - 2GB/day for 60 days");
                    System.out.println("4 : ₹797  - 2GB/day for 150 days");
                    break;

                case 4: // Vi
                    System.out.println("1 : ₹199  - 1.5GB/day for 28 days");
                    System.out.println("2 : ₹249  - 1.5GB/day for 28 days");
                    System.out.println("3 : ₹319  - 2GB/day for 31 days");
                    System.out.println("4 : ₹719  - 1.5GB/day for 84 days");
                    break;

                default:
                    System.out.println("Invalid operator choice!");
                    continue;
            }

            System.out.print("\nSelect an offer (1-4): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input!");
                sc.next();
                continue;
            }

            int offer = sc.nextInt();

            switch (offer) {
                case 1: amount = (operator == 3) ? 107 : (operator == 1 ? 149 : operator == 2 ? 179 : 199); break;
                case 2: amount = (operator == 3) ? 187 : (operator == 1 ? 199 : operator == 2 ? 265 : 249); break;
                case 3: amount = (operator == 3) ? 397 : (operator == 1 ? 299 : operator == 2 ? 399 : 319); break;
                case 4: amount = (operator == 3) ? 797 : (operator == 1 ? 666 : 719); break;
                default:
                    System.out.println("Invalid offer selection!");
                    continue;
            }

            balance += amount;

            System.out.println("\nRecharge Successful!");
            System.out.println("Recharge Amount : ₹" + amount);
            System.out.println("Current Balance : ₹" + balance);
        }

        sc.close();
    }

    public static void main(String[] args) {
        performMobileRecharge();
    }
}
