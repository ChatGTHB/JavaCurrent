package day10;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {

        // Answer that the password that the user will enter 2 times is the same,
        // SAME or NOT.  (confirm new password)

        Scanner input = new Scanner(System.in);

        System.out.print("Password: ");
        String password = input.nextLine();

        System.out.print("Password again: ");
        String passwordAgain = input.nextLine();

        boolean isEquals = password.equals(passwordAgain);

        if (isEquals) System.out.println("SAME");

        if (!isEquals) System.out.println("NOT");
    }
}
