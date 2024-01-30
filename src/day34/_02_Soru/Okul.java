package day34._02_Soru;

public class Okul {

    public static void main(String[] args) {

        OgrenciIlk oi = new OgrenciIlk("Erman", OgrTip.ILK, "Satranç");
        OgrenciOrta oo = new OgrenciOrta("Burak", OgrTip.ORTA, "LGS");
        OgrenciLise ol = new OgrenciLise("Ulvi", OgrTip.LISE, "MF");

        System.out.println("oi = " + oi);
        System.out.println("oo = " + oo);
        System.out.println("ol = " + ol);

    }
}
