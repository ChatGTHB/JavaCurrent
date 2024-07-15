package day17;

public class _04_JavaArray {
    public static void main(String[] args) {
        int[] array1 = new int[5]; // Array with elements at indexes 0, 1, 2, 3, 4
        int[] array2 = {3, 6, 56, 78, 98, 67, 89}; // Array with 7 elements
        int[] array3 = {3, 6, 56, 78, 98, 67, 89}; // Another array with 7 elements

        String[] words = new String[5]; // Array with 5 string elements
        boolean[] array4 = new boolean[5]; // Array with 5 boolean elements
        double[] ratios = new double[5]; // Array with 5 double elements

        // Printing the elements of int array1
        for (int i = 0; i < array1.length; i++) {
            System.out.println("int array1[" + i + "] = " + array1[i]);
        }

        // Printing the elements of string array words
        for (int i = 0; i < words.length; i++) {
            System.out.println("string words[" + i + "] = " + words[i]);
        }

        // Printing the elements of boolean array array4
        for (int i = 0; i < array4.length; i++) {
            System.out.println("boolean array4[" + i + "] = " + array4[i]);
        }

        // Printing the elements of double array ratios
        for (int i = 0; i < ratios.length; i++) {
            System.out.println("double ratios[" + i + "] = " + ratios[i]);
        }
    }
}
