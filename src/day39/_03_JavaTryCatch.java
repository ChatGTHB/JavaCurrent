package day39;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program çalışmaya başladı");

        try { // dene, hatanın başladığı yerin üstüne konur

            LocalDate tarih = LocalDate.of(2024, Month.FEBRUARY, 30);

        } // hatanın bittiği yer, hata olduğu zaman programı kırma
        catch (Exception ex) {   // ex isimli değişkende oluşan hataların bilgisi atanıyor
            //hata oldugunda yapılması istenenler buraya yazılıyor
            System.out.println("Lütfen tekrar deneyiniz");
            System.out.println("Tüm hata mesajı =" + ex);
            System.out.println("Hatanın açıklaması=" + ex.getMessage());
            // log tutma: bu hataları al bir yere kaydet, daha sonra programı
            // iyileştirmek için kullan
            // windows hataları arka planda toplayıp microsoft a gönderiyor,
        }

        System.out.println("program bitti");

        try {
            // Java ve Toolları çalışmaya devam et
            // Konuları öğrenmeye ve çalışmaya devam
        }// anlamadığın yer mi oldu ? kırılmadan devam et:
        catch (Exception ex) {
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // gereken videoları izle
            // grup çalışması yap
            // öğren ve kırılmadan devam et
            // unutma sen bir söz verdin , DEVAM
        }
        //sonunda seni güzel bir meslek bekliyor.
    }
}
