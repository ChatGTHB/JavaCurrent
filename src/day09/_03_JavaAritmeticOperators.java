package day09;

public class _03_JavaAritmeticOperators {
    public static void main(String[] args) {
        int total = 0, number = 1;

        total = total + number;       // Add total number : 1 was total
        number = number + 1;          // Increase Number by 1

        // It says you can write these 2 lines in one line
        total = 0;
        number = 1; // Brought to initial values

        total = total + number++; // total =1, number =2
        // ++ only affects the number

        /*********************************************/

        total = 0;
        number = 1; // Brought to initial values

        number = number + 1;
        total = total + number;         // number=2,  total=2

        // Instead of these two lines, you can write in one line like this
        total = 0;
        number = 1; // Brought to initial values

        total = total + ++number;   // number=2,  total=2

        //  ++ then process, then increment
        //  ++ If first, first increment, then operation
    }
}










