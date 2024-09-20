package day38;

import java.util.Arrays;

public class _03_DataTypesInMethods {
    public static void main(String[] args) {
        // Primitive type (int)
        int number = 5;
        increaseNumber(number);
        System.out.println("number = " + number);  // Output: 5, because primitive types are passed by value

        // Reference type (array)
        int[] array = {1, 2, 3};
        resetArray(array);
        System.out.println("array = " + Arrays.toString(array));  // Output: [0, 0, 0], because arrays are passed by reference

        // Strings in Java behave like primitive types in certain ways, even though they are objects
    }

    // This method takes an array and resets all its elements to 0
    public static void resetArray(int[] arrayParam) { // arrayParam points to the same array as array
        arrayParam[0] = 0;
        arrayParam[1] = 0;
        arrayParam[2] = 0;
    }

    // This method takes a primitive int and tries to increment it
    public static void increaseNumber(int num) {  // num gets a copy of the value of number
        num++;  // This will increment the local copy, not the original number
    }
}
