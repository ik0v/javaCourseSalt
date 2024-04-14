package chapter5;
import java.util.Scanner;

/*
--- Exercise ---
Calculate the final total of someone's cell phone bill.
Allow the operator to input the plan fee and the number of overage minutes.
Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal
Create separate methods to calculate the tax, overage fees, and final total.
Print the itemized bill.
 */

public class PhoneBillCalculator {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        // What we know
        double taxRate = 0.15;
        double overageMinCharge = 0.25;

        // Get unknown variables
        double planFee = getPlanFee();
        int overageMins = getOverageMins();

        scanner.close();

        // Calculate and print result
        double total = calculateAndPrintTotal(planFee, overageMins, overageMinCharge, taxRate);
    }

    public static double getPlanFee() {
        System.out.println("Enter plan fee:");
        return scanner.nextDouble();
    }

    public static int getOverageMins() {
        System.out.println("Enter overage minutes:");
        return scanner.nextInt();
    }

    public static double calculateAndPrintTotal(double planFee, int overageMins, double overageMinCharge, double taxRate) {
        System.out.printf("Your plan fee is $%.2f\n", planFee);

        double overageMinsCharge = overageMins * overageMinCharge;
        System.out.printf("Your overage minutes fee is $%.2f\n", overageMinsCharge);

        double total = planFee + overageMinsCharge;

        double tax = total * taxRate;
        System.out.printf("Your tax is $%.2f\n", tax);

        total += tax;
        System.out.printf("Your total bill is $%.2f\n", total);
        return total;
    }

}
