package chapter4;

// do while loop

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        // Get input from user, at least one time.
        do {
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("Sum is: " + sum);

            System.out.println("Would you like to start over? (true/false)");
            flag = scanner.nextBoolean();

        } while (flag);
    }
}
