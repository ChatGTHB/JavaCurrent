package day34._02_Soru;

public class OgrenciOrta extends Ogrenci {
    private String sinav;

    public OgrenciOrta(String isim, OgrTip tipi, String sinav) {
        super(isim, tipi);
        setSinav(sinav);
    }

    public String getSinav() {
        return sinav;
    }

    public void setSinav(String sinav) {
        this.sinav = sinav;
    }

    @Override
    public String toString() {
        return super.toString() + ", sinav=" + this.sinav;
    }
}
