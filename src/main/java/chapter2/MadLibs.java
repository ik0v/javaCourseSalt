package chapter2;

import java.util.Scanner;

// Simple program, asks user about adjective, season of the year
// and amount of coffee cups, then prints result message

public class MadLibs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the season of the year: ");
        String season = sc.nextLine();

        System.out.println("Enter the whole number (integer): ");
        int number = sc.nextInt();

        System.out.println("Type an adjective: ");
        sc.nextLine();
        String adjective = sc.nextLine();

        sc.close();

        System.out.println("On a " + adjective + " " + season +
                " day, I drink a min of " + number + " cups of coffee.");
    }
}
