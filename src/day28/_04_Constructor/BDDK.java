package day28._04_Constructor;

public class BDDK {
    public static void main(String[] args) {

        Bank bank1 = new Bank();
        bank1.adi = "Ziraat Bankası";
        bank1.kurulusYili = 1876;
        bank1.subeSayisi = 1500;

        Bank bank2 = new Bank("Garanti");
        Bank bank3 = new Bank("Akbank", 1980, 600);

        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println(bank3);
    }
}
