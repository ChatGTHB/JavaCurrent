package day33._02_Inheritance;

public class Cat extends Animal {

    // Constructor with inheritance
    public Cat(String color, int weight, String breed) {
        super(color, weight, breed);
    }

    @Override
    public void speak() {
        super.speak(); // Calls the method from the parent class
        System.out.println("meowed");
    }
}
