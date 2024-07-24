package day20;

public class _03_JavaMethod {
    public static void main(String[] args) {
        printHello();  // does not take any input and does not return any value
        printHello();

        printHelloWithName("ismet"); // takes input but does not return any value
        printHelloManyTimes(5);      // takes input but does not return any value
    }

    public static void printHello() {
        System.out.println("Hello World");
    }

    public static void printHelloWithName(String name) {
        System.out.println("Hello " + name);
    }

    public static void printHelloManyTimes(int times) { // start
        for (int i = 0; i < times; i++) {
            System.out.println("Hello");
        }
    } // end
}
