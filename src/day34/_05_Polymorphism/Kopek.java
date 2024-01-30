package day34._05_Polymorphism;

public class Kopek extends Hayvan {
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("Havladı");
    }

    public void kokladi() {
        System.out.println("Kokladi");
    }
}
