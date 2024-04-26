package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        // create new file
        createFile();
        try {
            createFileRethrow();
        } catch (IOException e) {
            System.out.println("Directory doe not exist");
        }

        numbersExceptionHandling();
    }

    public static void createFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void createFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }

    //Same method using try - with - resources
//    public static void numbersExceptionHandling() {
//        File file = new File("resources/numbers.txt");
//        try(Scanner fileReader = new Scanner(file)) {
//            while (fileReader.hasNext()) {
//                double num = fileReader.nextDouble();
//                System.out.println(num);
//            }
//        } catch (FileNotFoundException | InputMismatchException e) {
//            e.printStackTrace();
//        }
//    }
}
