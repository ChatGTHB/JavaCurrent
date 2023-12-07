package day07;

import java.util.Scanner;

public class _03_Example {
    public static void main(String[] args) {

        // An entered name and surname, for example "Joseph Burns" -> J.B. print it as .
        // Joseph Burns   ->   firstLetter = charAt(0)
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Name and Surname: ");
        String fullName = input.nextLine();

        char firstLetter = fullName.charAt(0); // Always gives the first letter
        int spaceIndex = fullName.indexOf(" ");
        char surnameFirstLetter = fullName.charAt(spaceIndex + 1); // I got the letter

        System.out.println(firstLetter + "." + surnameFirstLetter + ".");
    }
}
