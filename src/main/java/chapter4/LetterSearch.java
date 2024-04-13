package chapter4;
import java.util.Scanner;

// loop break

public class LetterSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get text
        System.out.println("Enter some text");
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        // Search text for letter A
        for (int i = 0; i < text.length(); i++) {
            char curLetter = text.charAt(i);
            if(curLetter == 'A' || curLetter == 'a') {
                letterFound = true;
                System.out.println("Letter a/A found at index: " + i);
                break;
            }
        }

        // Print out message in case letter As was not present in text
        if(!letterFound) System.out.println("This text does not contain letter 'A'");
    }
}
