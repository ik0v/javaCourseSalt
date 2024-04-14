package chapter5;
import java.util.Scanner;

// variable scope

public class InstantCreditCheck {

    // Initialize what we know
    static int reqSalary = 25_000;
    static int reqCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Get what we don't know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        // Check if user is qualified
        boolean isQualified = isUserQualified(salary, creditScore);

        // Notify the user
        notifyUser(isQualified);
    }

    public static double getSalary() {
        System.out.println("Enter your salary:");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score");
        return scanner.nextInt();
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        return creditScore >= reqCreditScore && salary >= reqSalary;
    }

    public static void notifyUser(boolean isQualified) {
        if(isQualified) System.out.println("Congrats! You've been approved.");
        else System.out.println("Sorry. You've been declined");
    }
}
