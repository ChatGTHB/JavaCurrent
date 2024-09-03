package day33._02_Inheritance;

public class Dog extends Animal {

    public Dog(String color, int weight, String breed) {
        super(color, weight, breed);
    }

    @Override
    public void speak() {
        // super.speak();
        System.out.println("barked");
    }
}
