package day26._04_Example;

public class SekilMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.length = 4;
        rectangle.width = 5;

        rectangle.alan(); // kendi değerleri alıp, işlem yapıp, yazdırıyor
        rectangle.cevre();

        int alani = rectangle.alan2();
        System.out.println("Alan = " + alani);

        rectangle.degerAta(6, 8);
        rectangle.alan();
        rectangle.cevre();
    }
}
