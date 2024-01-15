package day28._04_Constructor;

public class Bank {
    String adi;
    int subeSayisi;
    int kurulusYili;

    public Bank() {
    }

    public Bank(String adi) {
        this.adi = adi;
    }

    public Bank(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public String toString() {
        return "Banka{" + "adi='" + adi + '\'' + ", subeSayisi=" + subeSayisi + ", kurulusYili=" + kurulusYili + '}';
    }
}
