// Dylan Eckford
// OOP
// Currency Converter
// February 12, 2024

// Import Scanner for getting user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;

        // Get which currency the original amount is in
        System.out.println("Select the currency you want to convert from:");
        System.out.println("1. CAD");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        System.out.println("4. GBP");

        // While loop for validation of proper input
        while (true) {
            choice = scanner.nextInt();
            // If user input is between 1 and 4, the check passes
            // Otherwise, return an error and loop back
            if (choice >= 1 & choice <= 4) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
            }
        }

        Currency fromCurrency;
        String fromCur;
        // Use a case depending on which input the user chooses
        // Set a "fromCur" string to the currency name to use in the output
        switch (choice) {
            case 1:
                fromCurrency = new CAD();
                fromCur = "CAD";
                break;
            case 2:
                fromCurrency = new USD();
                fromCur = "USD";
                break;
            case 3:
                fromCurrency = new EUR();
                fromCur = "EUR";
                break;
            default:
                fromCurrency = new GBP();
                fromCur = "GBP";
                break;
        }

        // Get which currency the desired converted currency is
        System.out.println("Select the currency you want to convert to:");
        System.out.println("1. CAD");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        System.out.println("4. GBP");

        // Same while loop as before, just for the converted currency
        while (true) {
            choice = scanner.nextInt();
            if (choice >= 1 && choice <= 4) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
            }
        }

        // Same case statement, just for the converted currency
        Currency toCurrency;
        String toCur;
        switch (choice) {
            case 1:
                toCurrency = new CAD();
                toCur = "CAD";
                break;
            case 2:
                toCurrency = new USD();
                toCur = "USD";
                break;
            case 3:
                toCurrency = new EUR();
                toCur = "EUR";
                break;
            default:
                toCurrency = new GBP();
                toCur = "GBP";
                break;
        }

        // Ask for positive amount to convert, with validation
        System.out.println("Enter the amount you want to convert:");

        while (true) {
            amount = scanner.nextDouble();
            if (amount > 0) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }

        // Get the original currency, converted currency and inputted amount
        double result = fromCurrency.convert(toCurrency, amount);
        // Use the two string variables alongside the original and converted amounts to print
        System.out.printf("%.2f %s is equal to %.2f %s\n", amount, fromCur, result, toCur);

        // Close the Scanner
        scanner.close();
    }
}
