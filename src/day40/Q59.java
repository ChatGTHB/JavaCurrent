package day40;

public class Q59 {
    public static void main(String[] args) {
        int[] intArr = {8, 16, 32, 64, 128};

        // a
//        for (int i : intArr)
//            System.out.print(intArr[i] + " "); // ArrayIndexOutOfBoundsException

        // b - correct answer
        for (int i : intArr)
            System.out.print(i + " "); // Prints the elements of intArr

        // c - compile error
//        for (int i = 0: intArr) {
//            System.out.println(intArr[i] + " ");
//            i++;
//        }

        // d - prints the indices
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(i + " "); // Prints: 0 1 2 3 4
        }

        // e - correct answer
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " "); // Prints the elements of intArr
        }

        // f - compile error
//        for (int i; i < intArr.length; i++) {
//            System.out.println(intArr[i]);
//        }
    }
}
