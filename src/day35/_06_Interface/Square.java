package day35._06_Interface;

public class Square implements IGeometry {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return this.side * this.side;
    }

    @Override
    public double perimeter() {
        return (this.side + this.side) * 2;
    }
}
