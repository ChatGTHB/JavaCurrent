package Gun34._02_Soru;

public class OgrenciLise extends Ogrenci {
    private String brans;

    public OgrenciLise(String isim, OgrTip tipi, String brans) {
        super(isim, tipi);
        setBrans(brans);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return super.toString() + ", brans=" + this.brans;
    }
}
