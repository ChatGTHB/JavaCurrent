package day34._03_Polymorphism;

public class Animal {
    private String name;

    public Animal(String name) {
        setName(name);
    }

    public void sound() {
        System.out.println("made a sound");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
