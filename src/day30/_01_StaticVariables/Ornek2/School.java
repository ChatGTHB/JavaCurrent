package day30._01_StaticVariables.Ornek2;

public class School {

    public static void main(String[] args) {

        Student s1 = new Student(1, "İsmet Temur");
        Student s2 = new Student(2, "Mehmet Yılmaz");
        Student s3 = new Student(3, "Esma Dengesik");
        Student s4 = new Student(6, "Cilem Okkalı");
        // Problem: hem id yi takip etmek zorundayım,
        // hem de hata olasığı yüksek, esas çözüm
        // aşağıda

        Student s11 = new Student("İsmet Temur");
        Student s12 = new Student("Mehmet Yılmaz");
        Student s13 = new Student("Esma Dengesik");
        Student s14 = new Student("Cilem Okkalı");

        System.out.println(s11); //1
        System.out.println(s12); //2
        System.out.println(s13); //3
        System.out.println(s14); //4
    }
}
