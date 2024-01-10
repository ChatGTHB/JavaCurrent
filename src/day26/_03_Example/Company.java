package day26._03_Example;

public class Company {

    public static void main(String[] args) {

        Person calisan1 = new Person();
        calisan1.name = "Zehra";
        calisan1.surName = "Gül";
        calisan1.age = 18;

        Person calisan2 = new Person();
        calisan2.name = "Ayçin";
        calisan2.surName = "Kapar";
        calisan2.age = 19;

        System.out.println("1.Yöntem");
        System.out.println("calisan1.name = " + calisan1.name);
        System.out.println("calisan1.surName = " + calisan1.surName);
        System.out.println("calisan1.age = " + calisan1.age);

        System.out.println("calisan2.name = " + calisan2.name);
        System.out.println("calisan2.surName = " + calisan2.surName);
        System.out.println("calisan2.age = " + calisan2.age);

        System.out.println();
        System.out.println("2.Yöntem");
        BilgiYazdir(calisan1);
        BilgiYazdir(calisan2);

        System.out.println();
        System.out.println("3.Yöntem");
        calisan1.BilgiYazdir();
        calisan2.BilgiYazdir();

        calisan1.GetBirthYear();
        calisan2.GetBirthYear();
    }

    public static void BilgiYazdir(Person cal) {
        System.out.println("name = " + cal.name);
        System.out.println("surName = " + cal.surName);
        System.out.println("age = " + cal.age);
    }
}
