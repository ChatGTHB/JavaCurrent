package day21;

public class _02_JavaMethod {
    public static void main(String[] args) {

        int s1 = 4;
        int s2 = 12;
        int s3 = 12;

        int sonuc = toplamBul(s1, s2);
        int sonuc2 = toplamBul(s1, s2, s3);
        String sonuc3 = toplamBul("ismet", "temur");

        System.out.println("sonuc = " + sonuc);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }

    public static String toplamBul(String ad, String soyad) {
        return ad + soyad;
    }

    public static int toplamBul(int s1, int s2) {
        return s1 + s2;
    }

    public static int toplamBul(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

}
