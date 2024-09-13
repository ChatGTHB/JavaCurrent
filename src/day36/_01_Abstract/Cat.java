package day36._01_Abstract;

// Class Cat that extends the abstract class Animal
public class Cat extends Animal {

    // Implementing the abstract method from Animal
    @Override
    void sound() {
        System.out.println("Meowed.");
    }
}
