package day22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int number = 5; // a variable that can hold a single number.
        int[] array = new int[10]; // a 1D memory region with 10 elements
        int[][] table = new int[2][5]; // 10 elements but in 2 rows, 2D

        ArrayList<Integer> list = new ArrayList<>(); // single row, 1D, dynamically sizable

        // let's have a teacher's grade book
        ArrayList<Integer> mathGrades = new ArrayList<>(); // separate sheet, list, 1D
        ArrayList<Integer> physicsGrades = new ArrayList<>(); // separate sheet, list, 1D
        ArrayList<Integer> chemistryGrades = new ArrayList<>(); // separate sheet, list, 1D

        mathGrades.add(50);
        mathGrades.add(70);
        mathGrades.add(80);

        physicsGrades.add(40);
        physicsGrades.add(60);

        chemistryGrades.add(90);
        chemistryGrades.add(50);
        chemistryGrades.add(60);
        chemistryGrades.add(87);

        /******************************/
        ArrayList<ArrayList<Integer>> gradesList = new ArrayList<>();
        gradesList.add(mathGrades);
        gradesList.add(physicsGrades);
        gradesList.add(chemistryGrades);

        // Accessing elements
        mathGrades.get(0);  // gives the first math grade
        gradesList.get(0).get(0); // 0th list's 0th element, similar to row-column
        // notebook's.  0th page's.  0th element
        // gradesList.get(0)  -> gives the first added list
        gradesList.get(0).add(67);  // added one more element to mathGrades

        for (int i = 0; i < gradesList.size(); i++) { // similar to notlar.length

            for (int j = 0; j < gradesList.get(i).size(); j++) {  // similar to notlar[i].length
                System.out.print(gradesList.get(i).get(j) + "\t"); // similar to notlar[i][j]
            }
            System.out.println();
        }
    }
}
