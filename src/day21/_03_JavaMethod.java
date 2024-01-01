package day21;

public class _03_JavaMethod {

    public static void main(String[] args) {
        int s1 = 4;
        int s2 = 12;
        int s3 = 12;
        int s4 = 12;

        int sonuc  = toplamBul(s1, s2);
        int sonuc2 = toplamBul(s1, s2, s3);
        int sonuc3 = toplamBul(s1, s2, s3, s4);
    }

    public static int toplamBul(int s1, int s2) {
        return s1 + s2;
    }

    public static int toplamBul(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

    public static int toplamBul(int sayi1, int sayi2, int sayi3, int s4) {
        return sayi1 + sayi2 + sayi3 + s4;
    }
}
