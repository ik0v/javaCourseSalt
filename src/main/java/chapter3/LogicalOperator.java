package chapter3;
import java.util.Scanner;

// if - else

public class LogicalOperator {
    public static void main(String[] args) {

        // Initialize known values
        int requiredSalary = 30_000;
        int requiredYearsEmployed = 2;

        // Get what we don't
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter number of years at your current work:");
        double years = sc.nextDouble();

        // Make decision
        if(salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats! You qualify for the loan");
        } else {
            System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan");
        }
    }
}
