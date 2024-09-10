package day35._06_Interface;

public class Rectangle implements IGeometry {
    int shortSide;
    int longSide;

    public Rectangle(int shortSide, int longSide) {
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public double area() {
        return this.shortSide * this.longSide;
    }

    @Override
    public double perimeter() {
        return (this.shortSide + this.longSide) * 2;
    }
}
