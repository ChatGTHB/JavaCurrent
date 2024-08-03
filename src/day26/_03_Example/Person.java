package day26._03_Example;

public class Person {
    String name; // properties, attributes, fields
    String surname;
    int age;

    // methods, i.e., behaviors
    void printInfo() {
        System.out.println("emp1.name = " + this.name);
        System.out.println("emp1.surname = " + this.surname);
        System.out.println("emp1.age = " + this.age);
    } // this: refers to the current instance

    void getBirthYear() {
        System.out.println("Birth Year = " + (2024 - this.age));
    }
}
