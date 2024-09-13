package day36._02_Abstract;

public class Main {
    public static void main(String[] args) {
        // Create a rectangle and a circle object
        Rectangle rectangle = new Rectangle("Rectangle", 5, 10);
        Circle circle = new Circle("Circle", 7);

        // Use the draw method for both shapes
        rectangle.draw();
        circle.draw();

        // Print the details (toString method) of both shapes
        System.out.println(rectangle);
        System.out.println(circle);
    }
}
