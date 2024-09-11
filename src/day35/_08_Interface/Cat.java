package day35._08_Interface;

public class Cat implements IAnimal {
    @Override
    public String food() {
        return "Cat eats mice.";
    }

    public String sound() {
        return "Cat says meow.";
    }
}
