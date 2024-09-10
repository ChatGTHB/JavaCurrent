package day35._06_Interface_2;

public class Rectangle2 implements IGeometry2 {
    @Override
    public void area(int shortSide, int longSide) {
        System.out.println(shortSide * longSide);
    }

    @Override
    public void perimeter(int shortSide, int longSide) {
        System.out.println((shortSide + longSide) * 2);
    }
}
