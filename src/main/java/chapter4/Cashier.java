package chapter4;
import java.util.Scanner;

// for loop

public class Cashier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get number of items to scan
        System.out.println("Enter the number of items to scan:");
        int quantity = scanner.nextInt();

        double total = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the cost of item:");
            double price = scanner.nextDouble();
            total += price;
        }
        scanner.close();

        System.out.printf("Your total is $ %.2f", total);
    }
}
