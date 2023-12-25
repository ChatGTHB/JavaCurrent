package day17;

public class _03_JavaArray {

    public static void main(String[] args) {

        // 5 tv kanalı ismini bir diziye doldurunuz. trt, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] tvler = {"trt", "kanald", "atv", "fox", "habertürk"};

        int rndIndex = (int) (Math.random() * tvler.length); //0,1,2,3,4

        System.out.println("Rastgele seçilen tv = " + tvler[rndIndex]);
    }
}
