package day32._01_Encapsulation;

public class Kisi {
    String ad;
    String soyad;
    private int yas;

    public int getYas() {
        return this.yas;
    }

    public void setYas(int yas) {
        if (yas > 0 && yas < 100) this.yas = yas;
        else System.out.println("hatalı yas");
    }
}
