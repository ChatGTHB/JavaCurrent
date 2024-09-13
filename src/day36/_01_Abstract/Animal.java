package day36._01_Abstract;

// Abstract class definition
// An abstract class that acts as both a superclass and a superinterface.
public abstract class Animal {
    private String species; // Encapsulation: private variables with getter and setter methods
    private int age;

    // Abstract method to be implemented by subclasses
    abstract void sound();

    // A concrete method shared across all subclasses
    public void eat() {
        System.out.println("Ate food.");
    }

    // Getters and setters for encapsulated fields
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
