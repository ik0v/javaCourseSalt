package chapter7;
import java.util.Scanner;

// Optional exercise.
// Ask user about nr (from 1 to 7), and return corresponding day as String.
// Store days of the week in array.

public class DayOfTheWeek {

    // array initializer example
    private static String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = getDayOfTheWeek(scanner);
        System.out.println(day);
    }

    public static String getDayOfTheWeek (Scanner scanner) {
        int dayNr;

        // a simple input validation, we check if user typed a nr from 1 to 7;
        do {
            System.out.println("Enter number of the day, from 1 (Monday) to 7 (Sunday)");
            dayNr = scanner.nextInt();
        } while (dayNr < 1 || dayNr > 7);

        return days[dayNr - 1]; // we shall subtract 1, bcs arrays index start from 0
    }
}
