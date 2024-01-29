package day33._03_Inheritance;

public class GenelMudur extends Calisan {
    private double tazminat;

    public GenelMudur(String isim, double maas, int maasKatsayisi, double tazminat) {
        super(isim, maas, maasKatsayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla() + this.tazminat;
    }

    public double getTazminat() {
        return this.tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return super.toString() + ", tazminat= " + this.tazminat;
    }
}
