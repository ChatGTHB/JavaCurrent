package day26._05_Example;

public class ElektrikHesabi {

    // özellikler, properties, fields
    int toplamTuketim = 0;
    double birimFiyat = 20;

    void tuketimEkle(int aylikTuketim) {
        this.toplamTuketim += aylikTuketim;
        // this.toplamTuketim = this.toplamTuketim+ aylikTuketim;
    }

    void faturaYaz(String ad) {
        double toplamTutar = this.toplamTuketim * this.birimFiyat;
        System.out.println("*********************");
        System.out.println("    Faturanız");
        System.out.println("*********************");
        System.out.println("Müşteri = " + ad);
        System.out.println("Toplam Tüketiminiz = " + this.toplamTuketim);
        System.out.println("Toplam Tutar       = " + toplamTutar);
        System.out.println("*********************");
    }
}
