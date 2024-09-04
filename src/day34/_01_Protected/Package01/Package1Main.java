package day34._01_Protected.Package01;

public class Package1Main {
    public static void main(String[] args) {
        Package1Animal package1Animal = new Package1Animal();
        package1Animal.name = "black cat";
        package1Animal.age = 2;
        package1Animal.breed = "tabby";
        // package1Animal.color is not accessible as it's private to the class
    }
}
