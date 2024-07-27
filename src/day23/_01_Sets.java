package day23;

import java.util.ArrayList;

public class _01_Sets {
    public static void main(String[] args) {
        int number = 5;

        int[] array = new int[10];      // 1D
        int[][] table = new int[2][5];  // 2D

        ArrayList<Integer> list = new ArrayList<>();               // 1D
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();   // 2D

        /********************************************************/

        // Java, so far I've taken the necessary variables from you, thank you.
        // but I need an array that, when I add data to it, if duplicate data comes in, DO NOT ADD it,
        // Secondly, this array
        // a) if I want, no matter what I add, always keep the contents SORTED,
        // b) if I want, keep the insertion order,
        // c) if I want, to work as fast as possible, keep it in any order it prefers

        // These arrays suitable for bulk operations where all elements are processed together
        // rather than individual element operations are called SETs.
        // a) TreeSet       -> always sorted
        // b) LinkedHashSet -> in the order of insertion
        // c) HashSet       -> works quickly, order does not matter

        // There is no INDEX in these
    }
}
