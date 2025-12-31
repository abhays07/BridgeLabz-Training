/*
18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.Scanner;

public class CurrencyExchange {

    public static void convertCurrency() {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        char repeatChoice; // stores user's decision to continue or not

        // do-while ensures at least one conversion happens
        do {
            // Ask user to enter INR amount
            System.out.println("\nEnter the INR amount to convert:");
            double amount = sc.nextDouble();

            // Conversion calculations (rates are fixed as per requirement)
            double INR_TO_USD = amount * 0.011129;
            double INR_TO_EURO = amount * 0.009491;
            double INR_TO_POUND = amount * 0.008287;
            double INR_TO_AUSD = amount * 0.016650;
            double INR_TO_CUSD = amount * 0.015249;
            double INR_TO_SUSD = amount * 0.014313;
            double INR_TO_SWISS = amount * 0.008830;
            double INR_TO_YEN = amount * 1.742861;
            double INR_TO_YUAN = amount * 0.008287;

            // Display currency options
            System.out.println("\nCHOOSE CURRENCY FOR CONVERSION");
            System.out.println("1. Indian RS to US Dollars");
            System.out.println("2. Indian RS to EUROS");
            System.out.println("3. Indian RS to Pound");
            System.out.println("4. Indian RS to Australian Dollars");
            System.out.println("5. Indian RS to Canadian Dollars");
            System.out.println("6. Indian RS to Singapore Dollars");
            System.out.println("7. Indian RS to Swiss Franc");
            System.out.println("8. Indian RS to Japanese YEN");
            System.out.println("9. Indian RS to Chinese Yuan");
            System.out.println("10. Exit");

            // User selects conversion type
            System.out.println("Choose the conversion (1-10):");
            int choice = sc.nextInt();

            // Switch-case to handle selected conversion
            switch (choice) {
                case 1 -> System.out.println("The converted amount is: " + INR_TO_USD + " USD");
                case 2 -> System.out.println("The converted amount is: " + INR_TO_EURO + " EUROS");
                case 3 -> System.out.println("The converted amount is: " + INR_TO_POUND + " POUNDS");
                case 4 -> System.out.println("The converted amount is: " + INR_TO_AUSD + " AUSD");
                case 5 -> System.out.println("The converted amount is: " + INR_TO_CUSD + " CUSD");
                case 6 -> System.out.println("The converted amount is: " + INR_TO_SUSD + " SUSD");
                case 7 -> System.out.println("The converted amount is: " + INR_TO_SWISS + " SWISS FRANC");
                case 8 -> System.out.println("The converted amount is: " + INR_TO_YEN + " JAPANESE YENS");
                case 9 -> System.out.println("The converted amount is: " + INR_TO_YUAN + " CHINESE YUANS");
                default -> {
                    System.out.println("Thank you for using Currency Converter!");
                    sc.close();
                    return; // safely exit method
                }
            }

            // Ask user if they want another conversion
            System.out.println("\nDo you want to make another conversion? (y/n)");
            repeatChoice = sc.next().charAt(0);

        } while (repeatChoice == 'y' || repeatChoice == 'Y');

        // Final message after user exits
        System.out.println("\nThank you for Using Currency Converter 😊");
        sc.close();
    }

    public static void main(String[] args) {
        // Start the currency conversion process
        convertCurrency();
    }
}
