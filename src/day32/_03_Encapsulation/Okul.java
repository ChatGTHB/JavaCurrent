package day32._03_Encapsulation;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private int kontenjan;
    private final ArrayList<Ogrenci> ogrencileri = new ArrayList<>();

    public Okul(String okulAd, int kontenjan) {
        setOkulAd(okulAd);
        setKontenjan(kontenjan);
    }
    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public ArrayList<Ogrenci> getOgrencileri() {
        return ogrencileri;
    }
}
