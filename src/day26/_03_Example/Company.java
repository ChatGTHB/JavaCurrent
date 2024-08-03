package day26._03_Example;

public class Company {
    public static void main(String[] args) {
        Person employee1 = new Person();
        employee1.name = "John";
        employee1.surname = "Doe";
        employee1.age = 30;

        Person employee2 = new Person();
        employee2.name = "Jane";
        employee2.surname = "Smith";
        employee2.age = 25;

        System.out.println("Method 1");
        System.out.println("employee1.name = " + employee1.name);
        System.out.println("employee1.surname = " + employee1.surname);
        System.out.println("employee1.age = " + employee1.age);

        System.out.println("employee2.name = " + employee2.name);
        System.out.println("employee2.surname = " + employee2.surname);
        System.out.println("employee2.age = " + employee2.age);

        System.out.println();
        System.out.println("Method 2");
        printInfo(employee1);
        printInfo(employee2);

        System.out.println();
        System.out.println("Method 3");
        employee1.printInfo();
        employee2.printInfo();

        employee1.getBirthYear();
        employee2.getBirthYear();
    }

    public static void printInfo(Person emp) {
        System.out.println("name = " + emp.name);
        System.out.println("surname = " + emp.surname);
        System.out.println("age = " + emp.age);
    }
}
