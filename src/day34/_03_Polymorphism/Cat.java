package day34._03_Polymorphism;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Meowed");
    }

    public void scratch() {
        System.out.println("Scratched");
    }
}
