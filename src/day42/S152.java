package day42;

public class S152 {

    public static void main(String[] args) {

        int[][] n = {{1, 3},  //0.satır
                     {2, 4}}; //1.satır

        for (int i = n.length - 1; i >= 0; i--) { // i:1,0

            for (int y : n[i]) { // 1
                System.out.print(y);  // 2,4,1,3
            }
        }
    }
}
