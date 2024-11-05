package day42;

public class Q71 {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};

        System.out.println("arr.length = " + arr.length); // satır sayısı : 2
        System.out.println("arr[0].length = " + arr[0].length); // 1.(0 ind) satırın uzunluğu: 4
        System.out.println("arr[1].length = " + arr[1].length); // 2.(1 ind) satırın uzunluğu: 2

        for (int[] a : arr) { // a önce 1. satır sonra 2.satırı gönderir

            for (int i = 0; i < arr.length; i++) { // her bir satırı 2 ye kadar yani 0 ve 1 ind için yazacak
                System.out.print(a[i] + " ");
            }
            //System.out.println();
        }
    }
}
