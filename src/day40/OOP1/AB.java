package day40.OOP1;

public class AB {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("A.message = " + A.message); // Hello from A

        B b = new B();  // Constructor ran, static variable's value changed
        System.out.println("A.message = " + A.message); // Hello from B

        A a2 = new A();
        System.out.println("A.message = " + A.message); // Hello from B
    }
}

// What will be the output when the program runs?
