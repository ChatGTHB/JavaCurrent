package day18;

public class _06_Example {

    public static void main(String[] args) {

        // 2ye 3lük bir tabloyu random 100e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra yazdırınız

        int[][] tablo = new int[2][3];  // 2ye 3lük bir tablo

        //tabloyu random 100e kadar sayılarla doldurunuz
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                tablo[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                System.out.print(tablo[satir][sutun] + "\t");
            }
            System.out.println();
        }
    }
}
