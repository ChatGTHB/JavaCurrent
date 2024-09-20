package day38;

import java.util.Arrays;

public class _02_JavaDataTypes {
    public static void main(String[] args) {
        // Primitive types: int, short, byte, long, double
        int num1 = 5;
        int num2 = 10;

        num1 = num2;  // num1 becomes 10, num2 was already 10
        num1 = 45;
        num2 = 60;
        System.out.println("num1 = " + num1); // 45
        System.out.println("num2 = " + num2); // 60

        // Reference types: arrays, arraylists, objects
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6};
        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));

        array1 = array2;  // array1 now refers to the same location as array2
        System.out.println("array1 = " + Arrays.toString(array1)); // [5, 6]
        System.out.println("array2 = " + Arrays.toString(array2)); // [5, 6]

        array1[0] = 67;  // Modifying array1 also modifies array2 because they point to the same array
        System.out.println("array1 = " + Arrays.toString(array1)); // [67, 6]
        System.out.println("array2 = " + Arrays.toString(array2)); // [67, 6]

        array2[0] = 80;  // Modifying array2 affects array1 as well
        System.out.println("array1 = " + Arrays.toString(array1)); // [80, 6]
        System.out.println("array2 = " + Arrays.toString(array2)); // [80, 6]

        // Object types: Can hold null, behaves similarly to primitive types in assignment
        String name1 = "Ismet";
        String name2 = "Ayşe";

        System.out.println("name1 = " + name1); // Ismet
        System.out.println("name2 = " + name2); // Ayşe

        name1 = name2;  // name1 now points to the same reference as name2
        System.out.println("name1 = " + name1); // Ayşe
        System.out.println("name2 = " + name2); // Ayşe

        name1 = "Kaya";  // name1 now points to a new string, doesn't affect name2
        System.out.println("name1 = " + name1); // Kaya
        System.out.println("name2 = " + name2); // Ayşe

        // Assigning values to object types
        String str1;
        String str2 = null;  // null reference, meaning no memory location is assigned
        String str3 = "";  // An empty string is assigned
        String str4 = "Ismet";  // A string value is assigned
        String str5 = "Ahmet";  // Another string value, behaves like a primitive in terms of reassignment

        // str1.concat("Hello"); // This would throw an error because str1 is not initialized
        str2.concat("Hello");  // This line will throw a NullPointerException because str2 is null
    }
}
