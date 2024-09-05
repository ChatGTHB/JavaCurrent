package day34._02_Final.classFinal;

public class CarMain {
    public static void main(String[] args) {
        Vehicles vehicle = new Vehicles();
        vehicle.model = "Honda";

        // There are no limitations in usage.

        // If the class is final, it can be called multiple times in main,
        // but it cannot be extended by another class.
    }
}
