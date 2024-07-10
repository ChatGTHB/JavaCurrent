package day12;

import java.util.Scanner;

public class _05_IfElseIf {
    public static void main(String[] args) {

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        System.out.print("Number 1: ");
        int number1 = inputInt.nextInt();  // 15

        System.out.print("Number 2: ");
        int number2 = inputInt.nextInt();  // 3

        System.out.println("For sum S");
        System.out.println("For subtraction SU");
        System.out.println("For multiplication M");
        System.out.println("For divide D");
        System.out.print("Your choice: ");
        String yourChoice = inputStr.next().toUpperCase(); // S,SU,M,D

        if (yourChoice.equals("S")) System.out.println("Sum= " + (number1 + number2));
        else if (yourChoice.equals("SU")) System.out.println("Subtraction= " + (number1 - number2));
        else if (yourChoice.equals("P")) System.out.println("Multiplication= " + (number1 * number2));
        else System.out.println("Divide= " + ((double) number1 / number2));
    }
}
