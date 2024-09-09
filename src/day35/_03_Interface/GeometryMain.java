package day35._03_Interface;

public class GeometryMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Square square = new Square();
        square.draw();

        // Interfaces cannot be instantiated, but they can be used as reference types.
        // Polymorphism allows this.
        IDrawable drawable = new Rectangle();
        drawable.draw();
    }
}
