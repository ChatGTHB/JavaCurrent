package day30._02_FinalVariables._02_Example;

public class NufusMemurlugu {

    public static void main(String[] args) {

        Vatandas vatandas1 = new Vatandas("ismet", "Çekmeköy");
        Vatandas vatandas2 = new Vatandas("ayşe", "Şişli");
        Vatandas vatandas3 = new Vatandas("Çilem", "Bakırköy");

        System.out.println("vatandas1 = " + vatandas1);
        System.out.println("vatandas2 = " + vatandas2);
        System.out.println("vatandas3 = " + vatandas3);

        // vatandas1.TCNo=45; final değişkenlere sadece
        // tanımlanırken veya constructorda değer atanabilir.
    }
}
