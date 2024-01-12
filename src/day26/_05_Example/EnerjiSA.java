package day26._05_Example;

public class EnerjiSA {
    public static void main(String[] args) {

        Musteri musteri1 = new Musteri();

        musteri1.name = "Şeyma Nur";
        // musteri1 : nesne,
        // Musteri  : Tür,class,tip

        musteri1.elektrikHesabi.tuketimEkle(100); // Ocak
        musteri1.elektrikHesabi.tuketimEkle(200); // Şubat
        musteri1.elektrikHesabi.tuketimEkle(220); // Mart

        System.out.println("toplamTuketim = " + musteri1.elektrikHesabi.toplamTuketim);
        musteri1.elektrikHesabi.faturaYaz(musteri1.name);
    }
}
