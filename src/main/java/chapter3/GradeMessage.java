package chapter3;

// switch operator

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {

        // Get grade from user
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        // Define output message
        String message;

        switch (grade) {
            case "A" -> message = "Excellent job!";
            case "B" -> message = "Great job!";
            case "C" -> message = "Good job!";
            case "D" -> message = "You need to work a bit harder";
            case "F" -> message = "Uh oh!";
            default -> message = "Error. Invalid grade";
        }

        // Print out message
        System.out.println(message);
    }
}
