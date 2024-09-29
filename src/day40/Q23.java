package day40;

public class Q23 {
    public static void main(String[] args) {
        int[] stack = {10, 20, 30}; // indices: 0, 1, 2
        int size = 3;
        int idx = 0;

//        while (idx < size){  // idx < 3
//            idx++;
//        } // idx becomes 3

        do {
            idx++;
        } while (idx < size - 1);

        // idx should be 2
        System.out.println("idx = " + idx);
        System.out.println("The top element: " + stack[idx]);  // 30
    }
}
