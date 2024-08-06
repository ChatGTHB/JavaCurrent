package day26._04_Example;

public class Rectangle {
    int width;
    int length;

    // Method to calculate and print the area
    void calculateArea() {
        System.out.println("Area = " + (this.width * this.length));
    }

    // Method to calculate and print the perimeter
    void calculatePerimeter() {
        System.out.println("Perimeter = " + (this.width + this.length) * 2);
    }

    // Method to calculate and return the area
    int getArea() {
        return (this.width * this.length);
    }

    // Method to assign values to width and length
    void setValues(int width, int length) {
        this.width = width;
        this.length = length;
    }
}
