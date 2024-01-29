package day32._02_Encapsulation;

public class ArabaCom {

    public static void main(String[] args) {

        Araba araba1 = new Araba();
        araba1.setModel(2024);
        araba1.setRenk("Kırmızı");
        araba1.setMotorHacmi(1400);
        araba1.setKapiSayisi(9);

        System.out.println("araba1 = " + araba1);

        System.out.println("renk = " + araba1.getRenk());
        System.out.println("getModel = " + araba1.getModel());
        System.out.println("getMotorHacmi = " + araba1.getMotorHacmi());
        System.out.println("getKapiSayisi = " + araba1.getKapiSayisi());

        Araba araba2 = new Araba("siyah", 2023, 1500, 9);
        System.out.println("araba2 = " + araba2);
    }
}
