package day42;

public class Q39 {
    public static void main(String[] args) {
        String[][] shirts = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        // a) medium
        for (int index = 1; index < 2; index++) {
            for (int idx = 1; idx < 2; idx++) {
                System.out.println(shirts[index][idx] + ":");
            }
        }

        // b) small:
        for (int index = 0; index < 2; ++index) { // 0, 1
            for (int idx = 0; idx < index; ++idx) { // No elements at index 0
                System.out.println(shirts[index][idx] + ":");
            }
        }

        // d) Causes a runtime error because the index 2 exceeds the boundary
//        for (int index = 0; index <= 2; ) {
//            for (int idx = 0; idx <= 2; ) {
//                System.out.println(shirts[index][idx] + ":");
//                idx++;
//            }
//            index++;
//        }

        // c) correct
        for (String[] c : shirts) { // Sends each row and names it "c"
            for (String s : c) { // Assigns each element in the row to "s" and prints it
                System.out.println(s + ":");
            }
        }
    }
}
