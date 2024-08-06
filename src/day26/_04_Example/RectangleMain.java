package day26._04_Example;

public class RectangleMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.length = 4;
        rectangle.width = 5;

        // Use the methods to calculate and print area and perimeter
        rectangle.calculateArea(); // Takes its own values, performs calculation, and prints
        rectangle.calculatePerimeter();

        int area = rectangle.getArea();
        System.out.println("Area = " + area);

        rectangle.setValues(6, 8);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
