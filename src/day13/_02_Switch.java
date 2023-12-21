package day13;

import java.util.Scanner;

public class _02_Switch {
    public static void main(String[] args) {
        // Kullanıcının girdiği gün numarasına karşılık gelen günün adınız yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Gün no=");
        int gunNo=oku.nextInt();

//        if ( gunNo==1)
//            System.out.println("Pazartesi");
//        else
//            if (gunNo == 2)
//                System.out.println("Salı");

        switch (gunNo){
            case 1: System.out.println("Pazartesi"); break;
            case 2: System.out.println("Salı"); break;
            case 3: System.out.println("Çarşamba"); break;
            case 4: System.out.println("Perşembe"); break;
            case 5: System.out.println("Cuma"); break;
            case 6: System.out.println("Cumartesi"); break;
            case 7: System.out.println("Pazar"); break;
            default:System.out.println("Hatalı giriş yaptınız"); break;
        }
    }
}
