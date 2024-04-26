package chapter13;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
--- Optional exercise for chapter 13 ---

Write the following statement and execute:
    int c = 30/0;
Update program to handle exception;
Print a statement after division to say "Division is fun".
This statement should be printed no matter what.


I also made two additional methods, readAndDivideNumbers() and divide(double nr1, double nr2).

readAndDivideNumbers() method is responsible for reading two numbers from user and handles
InputMismatch exception internally with try - catch block.

divide(double nr1, double nr2) method accepts two doubles as parameters and does a division.
If a division by zero occurs, it throws ArithmeticException further (to main method).
*/

public class DividingByZero {
    public static void main(String[] args) {
        System.out.println(readAndDivideNumbers());
//        exercise();
    }

    public static void exercise() {
        try {
            int c = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide int  by zero");
        } finally {
            System.out.println("Division is fun");
        }
    }

    public static double readAndDivideNumbers() {
        Scanner scanner = new Scanner(System.in);
        double nr1 = 0, nr2 = 0;
        try {
            System.out.println("Enter first number, dividend");
            nr1 = scanner.nextDouble();
            System.out.println("Enter second number, divisor");
            nr2 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Please use numbers");
        }
        return divide(nr1, nr2);
    }

    public static double divide(double divident, double divisor) throws ArithmeticException {
        double answer = 0;
        if(divisor == 0) throw new ArithmeticException("You can't divide by zero");
        answer = divident / divisor;
        return answer;
    }
}
