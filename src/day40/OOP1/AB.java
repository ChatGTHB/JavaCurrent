package day40.OOP1;

public class AB {

    public static void main(String[] args) {

        A a = new A();
        System.out.println("A.mesaj = " + A.mesaj); // A dan merhaba

        B b = new B();  // consructor çalıştı static değişkenin değeri değişti
        System.out.println("A.mesaj = " + A.mesaj); // B den merhaba

        A a2 = new A();
        System.out.println("A.mesaj = " + A.mesaj); // B den merhaba
    }
}

// Program çalıştığında çıktısı ne olur

