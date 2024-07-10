package day12;

public class _01_JavaMath {
    public static void main(String[] args) {

        int a = 12;
        int b = 4;

        // Valid for 2 values
        System.out.println("Which is greater than a and b= " + Math.max(a, b));
        System.out.println("Which is smaller than a and b=" + Math.min(a, b));
        System.out.println("Third power of number 2 =" + Math.pow(2, 3));
        System.out.println("Square root of b=" + Math.sqrt(b));
        System.out.println("Rounding 3.1 = " + Math.round(3.1));// 3
        System.out.println("Rounding 3.5 = " + Math.round(3.5));// 4

        System.out.println("Ceil 3.1 = " + Math.ceil(3.1));   // 4, The nearest integer greater than this digit
        System.out.println("Ceil 3.9 = " + Math.ceil(3.9));   // 4, The nearest integer greater than this digit

        System.out.println("Floor 3.1 = " + Math.floor(3.1)); // 3, The nearest integer less than this digit
        System.out.println("Floor 3.9 = " + Math.floor(3.9)); // 3, The nearest integer less than this digit
    }
}
