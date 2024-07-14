package day14;

public class _01_WhileLoop {
    public static void main(String[] args) {

        // Find the sum of numbers from 1 to 100

        // What will happen inside the loop?
        // sum = sum + counter
        // counter++
        // loop condition counter <= 100

        int counter = 1, sum = 0;

        while (counter <= 100) {
            sum = sum + counter;
            counter++;
        }
        System.out.println("Sum = " + sum);
    }
}
