package day34._03_Polymorphism;

public class FarmMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Karabas");
        dog1.sound(); // Barked
        dog1.sniff(); // Sniffed

        Cat cat1 = new Cat("Kopuk");
        cat1.sound(); // Meowed
        cat1.scratch(); // Scratched

        dogSound(dog1);
        catSound(cat1);

        System.out.println("-------------------");
        animalSound(dog1); //
        animalSound(cat1); //
        // The ability to work both with its own type and the parent type
        // is called Polymorphism.
    }

    public static void animalSound(Animal animal) {
        // The type of animal will be its own type
        animal.sound(); // Each animal makes its own sound
    }

    public static void dogSound(Dog dog) {
        dog.sound(); // Barked
    }

    public static void catSound(Cat cat) {
        cat.sound(); // Meowed
    }
}
