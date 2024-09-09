package day35._05_Interface;

public class A7 implements IDisplayable, IPrintable {
    @Override
    public void display() {
        System.out.println("Displayed.");
    }

    @Override
    public void print(String msg) {
        System.out.println("msg = " + msg);
    }

    @Override
    public void print() {
        System.out.println("Printed.");
    }
}
