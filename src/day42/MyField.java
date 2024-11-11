package day42;

public class MyField {
    int x;
    int y;

    public static void main(String[] args) {
        MyField m1 = new MyField();
        m1.x = 100;
        m1.y = 200;

        MyField m2 = new MyField();
        m2.doStuff(100, 200); // Now m2 object's x and y fields will be updated to 100 and 200

        m1.display(); // 100, 200
        m2.display(); // 100, 200
    }

    public void doStuff(int x, int y) {
        this.x = x; // Assigns the incoming x parameter to the class field x
        this.y = y; // Assigns the incoming y parameter to the class field y
    }

    public void display() {
        System.out.println(x + " " + y + " : ");
    }
}
