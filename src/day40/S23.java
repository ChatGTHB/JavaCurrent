package day40;

public class S23 {

    public static void main(String[] args) {

        int[] stack = {10, 20, 30}; // 0,1,2 indexler
        int size = 3;
        int idx = 0;

//        while (idx < size){  // idx < 3
//            idx++;
//        } // idx 3

        do {
            idx++;
        } while (idx < size - 1);

        //idx 2 olmalı
        System.out.println("idx = " + idx);
        System.out.println("The Top elemen : " + stack[idx]);  // 30
    }
}
