package chapter2;

import java.util.Scanner;

public class GrossPayCalc {
    public static void main(String[] args) {

        System.out.println("Enter the number of hours the employee has worked: ");
        Scanner sc = new Scanner(System.in);
        int hoursWorked = sc.nextInt();

        System.out.println("Enter the employee's pays rate per hour: ");
        double payRate = sc.nextDouble();
        sc.close();

        double grossPay = hoursWorked * payRate;
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
