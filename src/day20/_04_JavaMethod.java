package day20;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // Print if a number is odd or even.
        int number = 55;

        // Method 1
        if (number % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");

        // Method 2
        printOddOrEven(60);
        printOddOrEven(55);
        printOddOrEven(46);
    }

    public static void printOddOrEven(int number) {
        if (number % 2 == 0) System.out.println(number + " : Even");
        else System.out.println(number + " : Odd");
    }
}
