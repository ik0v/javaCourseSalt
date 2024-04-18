package chapter7;
import java.util.Scanner;

// working with arrays further

public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];
        getGrades();

        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Higest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) sum += grade;   // example with oneliner for and enhanced for loop
        return sum;
    }

    public static double calculateAverage() {
        return (double) calculateSum() / grades.length;
    }

    public static int getHighest() {
        int highest = grades[0];
        for (int grade : grades) {
            if(grade > highest) highest = grade;   // example with oneliner
        }
        return highest;
    }

    public static int getLowest() {
        int lowest = grades[0];
        for (int grade : grades) {
            if(grade < lowest) lowest = grade;   // example with oneliner
        }
        return lowest;
    }


}
