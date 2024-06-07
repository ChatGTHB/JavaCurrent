package day07;

import java.util.Scanner;

public class _10_Example {

    public static void main(String[] args) {

        // Separate the name and surname of a name and surname entered at once and print them separately. (name and surname only)
        //  For example, Joseph Burns -> Print Joseph separately and Burns separately

        Scanner input = new Scanner(System.in);

        System.out.print("Name and surname: ");
        String nameSurname = input.nextLine();

        int spaceIndex = nameSurname.indexOf(" ");

        String name = nameSurname.substring(0, spaceIndex);
        String surname = nameSurname.substring(spaceIndex + 1);

        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
    }
}


