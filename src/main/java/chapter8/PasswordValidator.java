package chapter8;
import java.util.Scanner;

/*
--- Optional exercise for chapter 8 ---
Validate the complexity of a proposed password by assuring it meets these rules:
- at least 8 characters long
- contains an uppercase letter
- contains a special character
- not contain the username
- not the same as the old password
*/

public class PasswordValidator {

    public static boolean validatePassword(String password, String oldPassword, String username) {
        if(password.length() < 8) {
            System.out.println("Password is too short! Use at least 8 characters.");
            return false;
        } else if(password.contains(username)) {
            System.out.println("Your password can't contain username.");
            return false;
        } else if(password.equalsIgnoreCase(oldPassword)) {
            System.out.println("Your password can't be same as old one");
            return false;
        }
        boolean upperCase = false;
        boolean specialCharacter = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(Character.isUpperCase(c)) upperCase = true;
            if(!Character.isLetterOrDigit(c)) specialCharacter = true;
        }
        if(!upperCase) {
            System.out.println("You shall use upper case in your password");
            return false;
        } if(!specialCharacter) {
            System.out.println("You shall use special character in your password");
            return false;
        }
        System.out.println("Congrats! Your password is valid");
        return true;
    }

    public static void main(String[] args) {
        String username = "username";       // values are hardcoded for testing purposes
        String oldPassword = "12qwertY!";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Given data: username - " + username + ", oldPassword - " + oldPassword);
        System.out.println("Write a new password");
        String password = scanner.nextLine();

        boolean isValid = validatePassword(password, oldPassword, username);
        while (!isValid) {
            System.out.println("Write a new password");
            password = scanner.nextLine();
            isValid = validatePassword(password, oldPassword, username);
        }
        scanner.close();
    }

}
