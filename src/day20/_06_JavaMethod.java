package day20;

import java.util.Arrays;

public class _06_JavaMethod {
    public static void main(String[] args) {
        // In the main method, define an array with 20 elements, then send it to a function
        // to fill it with random numbers up to 100 and print it in the same function.

        int[] array = new int[20];

        fillArray(array);
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(array));
    }
}
