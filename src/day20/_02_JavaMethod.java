package day20;

public class _02_JavaMethod {
    public static void main(String[] args) {
        double randomValue = Math.random();  // does not take any input but returns a value
        int max = Math.max(5, 6);            // takes input and returns a value
        System.out.println();                // does not take any input and does not return a value

        System.out.println("Hello World");   // takes input, no return
        System.out.println("Hello World");
        System.out.println("Hello World");

        printHello(); // does not take any input and does not return anything
        printHello();
        printHello();
    }

    public static void printHello() {
        System.out.println("Hello World_method");
    }
}
