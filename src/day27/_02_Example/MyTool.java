package day27._02_Example;

public class MyTool {
    // Method to get the minimum of two numbers
    static int getMin(int a, int b) {
        return Math.min(a, b);
    }

    // Method to get the maximum of two numbers
    static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    // Method to get a random number up to a specified limit
    static int getRandom(int limit) {
        return (int) (Math.random() * limit);
    }

    // Method to raise a number to the power of another
    static double getPower(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    // Method to get the square root of a number
    static double getSquareRoot(int number) {
        return Math.sqrt(number);
    }
}
