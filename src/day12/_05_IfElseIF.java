package day12;

import java.util.Scanner;

public class _05_IfElseIF {
    public static void main(String[] args) {

        // Example : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Dersi ve notunu giriniz=");
        String dersVeNotu = oku.nextLine(); //Fizik:90

        //1.Yöntem
        int ind = dersVeNotu.indexOf(":"); // verilenin indexi ni verir
        String strNot = dersVeNotu.substring(ind + 1);  // "90"
        int ogrNot = Integer.parseInt(strNot);

        //2.Yöntem
        String strNot2 = dersVeNotu.replaceAll("[^0-9]", ""); // "90"
        int ogrNot2 = Integer.parseInt(strNot2);

        // ladder if : merdivenli if
        if (ogrNot >= 90) System.out.println("A");
        else if (ogrNot >= 80) System.out.println("B");
        else if (ogrNot >= 70) System.out.println("C");
        else if (ogrNot >= 60) System.out.println("D");
        else if (ogrNot >= 40) System.out.println("E");
        else System.out.println("F");
    }
}











