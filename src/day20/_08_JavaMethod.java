package day20;

public class _08_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");

        printHello();       // does not take any input, does not return any value
        printSum(4, 5);     // takes input, does not return any value
        printLargest(4, 5); // takes input, does not return any value

        int max = Math.max(4, 5);    // takes input, returns a value

        int max2 = getLargest(4, 5); // takes input, returns a value
        System.out.println(max2);
    }

    public static int getLargest(int num1, int num2) { // type of return value is specified after static
        int largest;

        if (num1 > num2) largest = num1;
        else largest = num2;

        return largest;
    }

    public static void printHello() { // void: no return, does not return any value
        System.out.println("Hello World");
    }

    public static void printSum(int num1, int num2) {
        System.out.println("Sum = " + (num1 + num2));
    }

    public static void printLargest(int num1, int num2) {
        if (num1 > num2) System.out.println(num1 + " is larger");
        else System.out.println(num2 + " is larger");
    }
}
