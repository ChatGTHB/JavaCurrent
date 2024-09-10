package day35._06_Interface;

public class GeoMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        Square square = new Square(5);
        System.out.println(square.area());
        System.out.println(square.perimeter());
    }
}
