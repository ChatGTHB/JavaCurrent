package day33._03_Inheritance;

public class Calisan {
    private String isim;
    private double maas;
    private int maasKatsayisi;

    public Calisan(String isim, double maas, int maasKatsayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatsayisi(maasKatsayisi);
    }

    public double maasHesapla(){
        return this.maas*this.maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + this.isim + '\'' +
                ", maas=" + this.maas +
                ", maasKatsayisi=" + this.maasKatsayisi +
                ", Net Maaş=" + maasHesapla() +
                '}';
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return this.maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getMaasKatsayisi() {
        return maasKatsayisi;
    }

    public void setMaasKatsayisi(int maasKatsayisi) {
        this.maasKatsayisi = maasKatsayisi;
    }
}
