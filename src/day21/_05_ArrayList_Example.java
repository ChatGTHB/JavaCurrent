package day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _05_ArrayList_Example {
    public static void main(String[] args) {
        /**
         * Take a 6-element array (numbers) from the user and
         * store only the odd numbers in a separate list (ArrayList) and print them.
         */

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Number = ");
            array[i] = scanner.nextInt();
        }

        System.out.println("array = " + Arrays.toString(array));

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) oddNumbers.add(array[i]);
        }

        // 1st way: print the list directly
        System.out.println("oddNumbers = " + oddNumbers);

        // 2nd way: print each element separately
        for (int i = 0; i < oddNumbers.size(); i++)
            System.out.print(oddNumbers.get(i) + "\t");
    }
}
