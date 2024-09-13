package day36._02_Abstract;

public abstract class Shape {
    private String name; // Encapsulation: Name field with getter method

    // Constructor to set the shape's name
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for calculating area and perimeter
    public abstract double area(); // Abstract method to calculate area
    public abstract double perimeter(); // Abstract method to calculate perimeter

    // Concrete method to return the name of the shape
    public String getName() {
        return name;
    }

    // Concrete method to print the shape's name and indicate it has been drawn
    public void draw() {
        System.out.println(name + " has been drawn.");
    }

    // Concrete method to return a formatted string with shape details
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + area() + ", Perimeter: " + perimeter();
    }
}

