package day41;

public class S16 {

    public static void main(String[] args) {

        int cnt = 0;
        String[][] arr = {{"A", "B", "C"},   // 0.satır
                {"D", "E"}         // 1.satır
        };

        for (int i = 0; i < arr.length; i++) {  //0

            for (int j = 0; j < arr[i].length; j++) {  // 0,1,2
                System.out.print(arr[i][j] + " "); // A,B,C,D,E

                if (arr[i][j].equals("B")) {
                    continue; //etkisiz eleman
                }
            }
            continue; //etkisiz eleman
        }
    }
}
