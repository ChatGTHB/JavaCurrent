package day32._02_Encapsulation;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModelYear(2024);
        car1.setColor("Red");
        car1.setEngineCapacity(1400);
        car1.setNumberOfDoors(9); // Invalid number, will trigger validation message

        System.out.println("car1 = " + car1);

        System.out.println("Color = " + car1.getColor());
        System.out.println("Model Year = " + car1.getModelYear());
        System.out.println("Engine Capacity = " + car1.getEngineCapacity());
        System.out.println("Number of Doors = " + car1.getNumberOfDoors());

        Car car2 = new Car("Black", 2023, 1500, 9); // Invalid number, will trigger validation message
        System.out.println("car2 = " + car2);
    }
}
