package day36._02_Abstract;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14159;

    // Constructor for Circle that takes the radius
    public Circle(String name, double radius) {
        super(name); // Calling the constructor of the superclass (Shape)
        this.radius = radius;
    }

    // Implementing the abstract method for area calculation
    @Override
    public double area() {
        return PI * radius * radius;
    }

    // Implementing the abstract method for perimeter calculation
    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
