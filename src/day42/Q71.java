package day42;

public class Q71 {
    public static void main(String[] args) {

        int[][] arr = new int[2][4];
        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};

        System.out.println("arr.length = " + arr.length); // number of rows: 2
        System.out.println("arr[0].length = " + arr[0].length); // length of the first (index 0) row: 4
        System.out.println("arr[1].length = " + arr[1].length); // length of the second (index 1) row: 2

        for (int[] a : arr) { // `a` first takes the 1st row, then the 2nd row

            for (int i = 0; i < arr.length; i++) { // prints each row up to 2 times, i.e., index 0 and 1
                System.out.print(a[i] + " ");
            }
            //System.out.println();
        }
    }
}
