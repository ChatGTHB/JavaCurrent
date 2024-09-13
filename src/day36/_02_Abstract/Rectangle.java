package day36._02_Abstract;

public class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor for Rectangle that takes width and height
    public Rectangle(String name, double width, double height) {
        super(name); // Calling the constructor of the superclass (Shape)
        this.width = width;
        this.height = height;
    }

    // Implementing the abstract method for area calculation
    @Override
    public double area() {
        return width * height;
    }

    // Implementing the abstract method for perimeter calculation
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
