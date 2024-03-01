package day42;

public class MyField {
    int x;
    int y;

    public static void main(String[] args) {
        MyField m1 = new MyField();
        m1.x = 100; // 100
        m1.y = 200; // 200

        MyField m2 = new MyField();
        m2.doStuff(100, 200); // m2 nesnesinin x ve y sine bir atanamıyor

        m1.display(); // 100,200
        m2.display(); // 0,0
    }

    public void doStuff(int x, int y) { // 100, 200
        x = x;               //this.x=x;  gelen x, gelen x e atanmız
        y = this.y;          //this.y=y;
    }

    public void display() {
        System.out.println(x + " " + y + " : ");
    }
}
