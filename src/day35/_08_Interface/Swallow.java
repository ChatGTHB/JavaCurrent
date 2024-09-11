package day35._08_Interface;

public class Swallow implements IFlying {
    @Override
    public String food() {
        return "Swallow eats insects.";
    }

    @Override
    public String flies() {
        return "Swallow flies south for the winter.";
    }
}
