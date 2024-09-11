package day35._08_Interface;

public class Duck implements ISailing {
    @Override
    public String food() {
        return "Duck eats bread.";
    }

    @Override
    public String swim() {
        return "Duck swims in the lake.";
    }

    public String walk() {
        return "Duck waddles around.";
    }
}
