import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
        int[][] dizi = {{2,3,2} , {4,1,5} , {7,2,5}};
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(Arrays.toString(dizi[i]).replaceAll("2","6") + " ");
            System.out.println();
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j]);
            }
            System.out.println();
        }
    }


}
