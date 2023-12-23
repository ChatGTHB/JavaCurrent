package day15;

import java.util.Scanner;

public class _06_Continue {
    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker
        // ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cümle giriniz=");
        String cumle = oku.nextLine();

        // Bugün hava çok güzel 0-> length-1

        for (int i = 0; i < cumle.length(); i++) {
            char harf = cumle.charAt(i); //0,1,2,3,4

            if (harf == ' ') continue; //bir sonraki adıma geç
            // benden sonrakilerini dikkate alma

            System.out.println("harf = " + harf);
        }
    }
}
