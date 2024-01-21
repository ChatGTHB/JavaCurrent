package day30._02_FinalVariables.Ornek2;

public class Vatandas {
    String isim;
    String adres;
    final int TCNo;
    private static int TCNoSayac=1;

    public Vatandas(String isim, String adres) {
        this.isim = isim;
        this.adres = adres;
        this.TCNo=TCNoSayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", TCNo=" + TCNo +
                '}';
    }
}
