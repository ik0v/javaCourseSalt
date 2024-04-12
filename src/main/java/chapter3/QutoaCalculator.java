package chapter3;

// IF ELSE


import java.util.Scanner;

public class QutoaCalculator {
    public static void main(String[] args) {

        // Initialize known values
        int quota = 10;

        // Get unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        sc.close();

        // Make a decision on the path to take - Output
        if(sales >= quota) {
            System.out.println("Congrats! You've met your quota");
        } else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. Your were " + salesShort + " sales short.");
        }
    }
}
