package day15;

import java.util.Scanner;

public class _03_ForLoop {
    public static void main(String[] args) {

        // Girilen bir sayıya (dahil) kadar olan sayıların çarpımını bulunuz
        // Bölüm 2 : carpimin sonucu 10000 i geçtiğinde işlem sonlansın.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sinir=oku.nextInt();

        int carpim=1;
        for(int i=1; i <= sinir; i++)
        {
            carpim=carpim*i;  // 1*2*3*4*5...

            if (carpim > 10000) {
                System.out.println("break çalıştı");
                break;
            }
        }
        System.out.println("carpim = " + carpim);
    }
}
