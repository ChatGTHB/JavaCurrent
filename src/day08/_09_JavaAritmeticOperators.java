package day08;

public class _09_JavaAritmeticOperators {
    public static void main(String[] args) {

        // Arithmetic operations in Java
        int a = 9;
        int b = 5;

        System.out.println("Aggregation Process = " + (a + b)); // 14
        System.out.println("Extraction Process = " + (a - b));  // 4
        System.out.println("Multiplication = " + (a * b));      // 45

        System.out.println("Division = " + (a / b));            // 1
        System.out.println("Division = " + (a / (double) b));   //1.8
        // The normal result is 1.8, but the computer discards the fraction if they are both of the integer type
        // For this reason, the result is 1, it does not round, the intint partition result is int
        // If you want a fractional result, at least one of the participants must be double

        int remaining = 9 % 5;  // Modül % --> This process divides and gives only the remainder
        System.out.println("remaining = " + remaining);
    }
}
