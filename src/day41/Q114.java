package day41;

public class Q114 {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[2]; // 2 elements initialized to 0,0
        numbers[0] = 10;
        numbers[1] = 20;      // 10, 20

        numbers = new int[4]; // 4 elements initialized to 0, 0, 0, 0
        numbers[2] = 30;
        numbers[3] = 40;

        for (int x : numbers) {
            System.out.print(" " + x);
        }
    }
}
