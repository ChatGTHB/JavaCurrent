package day33._03_Inheritance;

public class SirketMain {

    public static void main(String[] args) {

        Calisan cal = new Calisan("ismet", 10000, 2);
        System.out.println("cal = " + cal);

        GenelMudur gm = new GenelMudur("Hakan", 10000, 2, 5000);
        System.out.println("gm = " + gm);
    }
}
