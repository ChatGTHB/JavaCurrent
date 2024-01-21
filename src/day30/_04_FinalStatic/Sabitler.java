package day30._04_FinalStatic;

public class Sabitler {

    static final int birGundekiSaatSayisi = 24;
    static final int birSaatdekiDakSayisi = 60;
    static final int birDakikadakiSanSayisi = 60;

    public static int hesapla(int gun, int saat, int dak){

        int toplamSaniye= gun * Sabitler.birGundekiSaatSayisi * Sabitler.birSaatdekiDakSayisi * Sabitler.birDakikadakiSanSayisi +
                          saat * Sabitler.birSaatdekiDakSayisi * Sabitler.birDakikadakiSanSayisi +
                          dak * Sabitler.birDakikadakiSanSayisi;

        return toplamSaniye;
    }
}
