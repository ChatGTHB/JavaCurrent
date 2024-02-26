package day41;

public class S64 {


    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " "); // A

            if (arr[i].equals("C")) {
                continue; //kendsiinden sonra gelenleri pass
            }

            System.out.println("Work Done"); // Work Done
            break; // break: döngüyü kırar hatırla !
        }
    }
}
