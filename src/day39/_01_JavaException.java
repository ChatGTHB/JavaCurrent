package day39;

public class _01_JavaException {
    public static void main(String[] args) {
        // Except -> beklenmeyen, istisna,

        System.out.println("program çalışmaya başladı");

        String kelime = "";
        char harf = kelime.charAt(3); // Runtime Error

        System.out.println("program bitti");

        // Yazılı programı -> çalışır hale dönüştürmeye : Derlemek, COMPILE

    }
}
// daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
// Derleme zamanı yani COMPILE ERROR, Exception diyoruz.(Syntax hatası)

//program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
//çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.