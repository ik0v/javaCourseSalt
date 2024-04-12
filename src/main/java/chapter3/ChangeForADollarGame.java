package chapter3;

// change for a dollar game

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Getting data from user
        System.out.println("Enter amount of pennies:");
        int pennies = scanner.nextInt();

        System.out.println("Enter amount of nickels:");
        int nickels = scanner.nextInt();

        System.out.println("Enter amount of dimes:");
        int dimes = scanner.nextInt();

        System.out.println("Enter amount of quarters:");
        int quarters = scanner.nextInt();

        scanner.close();

        // Counting all coins
        int sum = quarters * 25 + dimes * 10 + nickels * 5 + pennies;

        // Determining result
        String result;
        if(sum > 100) result = "Well, you went over one $ by " + (sum-100) + " cents";
        else if(sum == 100) result = "Congrats, you entered exactly one $";
        else result = "Well, you are short of one $ by " + (100-sum) + " cents";

        // Print out message
        System.out.println(result);
    }
}
