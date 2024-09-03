package day33._02_Inheritance;

public class Duck extends Animal {
    private int wingLength;

    public Duck(String color, int weight, String breed, int wingLength) {
        super(color, weight, breed);
        setWingLength(wingLength);
    }

    public int getWingLength() {
        return wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }

    @Override
    public void speak() {
        System.out.println("Quack quack");
    }
}
