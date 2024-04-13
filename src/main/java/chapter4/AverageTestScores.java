package chapter4;
import java.util.Scanner;

// nested loops

public class AverageTestScores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Initialize what we know
        int nrOfStudents = 5;
        int nrOfTests = 4;

        // Process all students
        for (int i = 0; i < nrOfStudents; i++) {
            double total = 0;
            for (int j = 0; j < nrOfTests; j++) {
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total += score;
            }
            double avg = total/nrOfTests;
            System.out.println("The test avg for student #" + (i+1) + " is " + avg);
        }
        scanner.close();

    }
}
