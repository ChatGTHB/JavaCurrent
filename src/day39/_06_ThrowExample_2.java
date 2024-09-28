package day39;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create a new password");

        try {
            System.out.print("New password=");
            String newPassword = scanner.nextLine();

            // Check if the password length is less than 8 characters
            if (newPassword.length() < 8) throw new Exception("Password must be at least 8 characters long");

            // Check if the password length exceeds 15 characters
            if (newPassword.length() > 15) throw new Exception("Password must not exceed 15 characters");

        } catch (Exception exception) {
            System.out.println("Please pay attention");
            System.out.println(exception.getMessage());
            // log the exception
            // block the account if invalid attempts exceed a certain number
            // check if the password is one of the previous ones
        }
    }
}
