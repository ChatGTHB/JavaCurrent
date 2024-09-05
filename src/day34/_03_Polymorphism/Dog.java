package day34._03_Polymorphism;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Barked");
    }

    public void sniff() {
        System.out.println("Sniffed");
    }
}
