package day33._02_Inheritance;

public class Snake extends Animal {
    private int length;

    public Snake(String color, int weight, String breed, int length) {
        super(color, weight, breed);
        setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void speak() {
        System.out.println("hiss");
    }

    @Override
    public String toString() {
        return super.toString() + ", length= " + this.length;
    }
}
