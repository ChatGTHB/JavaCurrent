package day40;

public class S21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // indices: 0, 1, 2, 3

        int i = 0;

        do {
            System.out.print(arr[i] + " "); // 1, 2, 3, 4
            i++;
        } while (i < arr.length + 1); // i < 5 -> 1, 2, 3, 4
    }
}
