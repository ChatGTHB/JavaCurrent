package day13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        System.out.print("1.Sayı = ");
        int sayi1= okuInt.nextInt();  // 15

        System.out.print("2.Sayı = ");
        int sayi2= okuInt.nextInt();  // 3

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma  için P");
        System.out.println("Bölme   için B");
        System.out.print("Seçiminiz=");
        String seciminiz=okuStr.next().toUpperCase(); // T,Ç,P,B

        switch (seciminiz){
            case "T": System.out.println("toplam="+ (sayi1+sayi2) ); break;
            case "Ç": System.out.println("Çıkarma="+ (sayi1-sayi2) );break;
            case "P": System.out.println("Çarpma = "+ (sayi1*sayi2) );break;
            case "B": System.out.println("Bölme = "+ ((double)sayi1/sayi2));break;
            default : System.out.println("Hatalı giriş yaptını"); break;
        }

        // Çalışma mantığı: seciminiz T ye eşitse case de ki karşılığını yap ve çık(break)
        // default : diğer şartlar gerçekleşmediyse, yukarıdaki tüm caselerin ELSE si gib
    }

}
