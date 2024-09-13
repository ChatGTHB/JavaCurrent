package day36._01_Abstract;

public class FarmMain {
    public static void main(String[] args) {
        Cat cat = new Cat(); // Creating a Cat object
        cat.sound(); // Output the sound of the cat, prints "Meowed."

        Dog dog = new Dog(); // Creating a Dog object
        dog.sound(); // Output the sound of the dog, prints "Barked."
    }
}

