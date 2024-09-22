package day39;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create a new password");

        System.out.print("New password = ");
        String newPassword = scanner.nextLine();

        try {
            validatePassword(newPassword);
            System.out.println("Password created successfully.");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    // Method to validate the password length
    public static void validatePassword(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Password must be at least 8 characters long.");
            // You can log this error, block the user after multiple invalid attempts, or check for old passwords
        }

        if (password.length() > 15) {
            throw new Exception("Password must be at most 15 characters long.");
            // Same as above: log the error, handle invalid attempts, or check against previous passwords
        }
    }
}
