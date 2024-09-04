package day34._01_Protected.Package02;

import day34._01_Protected.Package01.Package1Animal;

public class Package2Main {
    public static void main(String[] args) {
        Package1Animal package1Animal = new Package1Animal();
        package1Animal.name = "dog";  // public field, accessible from anywhere
    }
}
