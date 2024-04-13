package chapter4;

// while loop

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        // Initialize known variables
        int rate = 15;
        int maxHours = 40;

        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours did you work this week?");
        double hoursWorked = scanner.nextDouble();

        // Validate input

        while (hoursWorked < 0 || hoursWorked > maxHours) {
            System.out.println("Invalid entry. Enter hours between 0 and 40.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        // Calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay is: $" + gross);
    }
}
