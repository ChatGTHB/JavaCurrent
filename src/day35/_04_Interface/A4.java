package day35._04_Interface;

public class A4 implements IDisplayable, IPrintable {

    @Override
    public void display() {
        System.out.println("Displayed.");
    }

    @Override
    public void print() {
        System.out.println("Printed.");
    }
}

