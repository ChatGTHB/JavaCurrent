package day36._01_Abstract;

// Class Dog that extends the abstract class Animal
public class Dog extends Animal {

    // Implementing the abstract method from Animal
    @Override
    public void sound() {
        System.out.println("Barked.");
    }
}
