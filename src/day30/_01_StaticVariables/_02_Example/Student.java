package day30._01_StaticVariables._02_Example;

public class Student {
    private int id=1;
    String fullName;
    private static int sayac=1;
    // sen bitanesin,
    // static olmadan herzaman 0 la başlıyordu
    // static olduğunda artık bir tane olduğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.
    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }// maindeki ilk 4 satır için gerekli,
    // static değişkenden sonra gerek kalmadı

    public Student(String fullName) {
        this.fullName = fullName;
        this.id=sayac++;
        //sayac=sayac+1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
