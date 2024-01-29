package day33._02_Inheritance;

public class Kedi extends Hayvan {

    //vasiyet, şartlı miras, constructor var ise
    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        super.konustu(); // parentdeki çalıştırır
        System.out.println("miyavladı");
    }
}
