package day19;

public class _01_Example {

    public static void main(String[] args) {

        // 2 ye 5 lik bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // kaç tane tek sayı olduğunu bulunuz.

        int[][] tablo = new int[2][5];
        // random sayılarla doldurma
        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                tablo[satir][sutun] = (int) (Math.random() * 100); //10 kez çalıştı

        }

        int tekMiktar = 0; // tek miktarını bulma
        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                if (tablo[satir][sutun] % 2 == 1) tekMiktar++;
        }

        System.out.println("tekMiktar = " + tekMiktar);
    }
}
