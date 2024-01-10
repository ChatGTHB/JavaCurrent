package day26._03_Example;

public class Person {
    String name; // properties, özellik, field
    String surName;
    int age;

    //metodları yani davranişları
    void BilgiYazdir() {
        System.out.println("cal1.name = " + this.name);
        System.out.println("cal1.surName = " + this.surName);
        System.out.println("cal1.age = " + this.age);
    } // this: bu yani kendisi manasında

    void GetBirthYear() {
        System.out.println("Birth Year=" + (2024 - this.age));
    }
}
