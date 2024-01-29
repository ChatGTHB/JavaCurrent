package day33._02_Inheritance;

public class Ordek extends Hayvan {
    private int kanatUzunlugu;

    public Ordek(String renk, int kilo, String cinsi, int kanatUzunlugu) {
        super(renk, kilo, cinsi);
        setKanatUzunlugu(kanatUzunlugu);
    }

    public int getKanatUzunlugu() {
        return kanatUzunlugu;
    }

    public void setKanatUzunlugu(int kanatUzunlugu) {
        this.kanatUzunlugu = kanatUzunlugu;
    }

    @Override
    public void konustu() {
        System.out.println("Vak vak");
    }
}
