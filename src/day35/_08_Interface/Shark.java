package day35._08_Interface;

public class Shark implements ISailing {
    @Override
    public String food() {
        return "Shark eats fish.";
    }

    @Override
    public String swim() {
        return "Shark swims in the ocean.";
    }

    public String hunt() {
        return "Shark is hunting.";
    }
}
