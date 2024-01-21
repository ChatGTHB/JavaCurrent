package day30._02_FinalVariables.Ornek1;

public class Student {
    private static int sayac = 1; // sadece class ın içinde erişilebilir
    final int id;   // final değişkenlere ya tanımlandığında ya da constructorda
                    // değer atanabilir ve sonra değiştirilemez
    String fullName;

    public Student(String fullName) {
        this.fullName = fullName;
        this.id = sayac++;
    }

    @Override
    public String toString() {
        // this.id=56;  // daha sonradan değer atanamasın değiştirilemesin

        return "Student{" + "id=" + id + ", fullName='" + fullName + '\'' + '}';
    }
}
