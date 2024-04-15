package chapter6;
import java.util.Scanner;

// objects as method parameters

public class HomeAreaCalculatorRedo {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        var calculator = new HomeAreaCalculatorRedo(); // use of local variable type inference (var)

        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        calculator.scanner.close();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

    }

    public Rectangle getRoom() {
        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rect1, Rectangle rect2) {
        return rect1.calculateArea() + rect2.calculateArea();
    }
}
