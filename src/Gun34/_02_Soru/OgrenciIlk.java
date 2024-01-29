package Gun34._02_Soru;

public class OgrenciIlk extends Ogrenci {
    private String klup;

    public OgrenciIlk(String isim, OgrTip tipi, String klup) {
        super(isim, tipi);
        setKlup(klup);
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return super.toString() + ", klup=" + this.klup;
    }
}
