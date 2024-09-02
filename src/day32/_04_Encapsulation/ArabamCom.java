package day32._04_Encapsulation;

import java.util.Scanner;

public class ArabamCom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CarDealership dealership = new CarDealership("Best Cars Dealership", 3); // Max capacity: 3 cars

        while (dealership.getCars().size() < dealership.getMaxCarCapacity()) {
            System.out.print("Enter Car Model (Year): ");
            String model = scanner.nextLine();

            if (Integer.parseInt(model) <= 2000) {
                System.out.println("Car model must be newer than 2000. Please enter another car.");
                continue;
            }

            System.out.print("Enter Car Brand: ");
            String brand = scanner.nextLine();

            System.out.print("Enter Car Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            Car car = new Car(model, brand, price);
            dealership.addCar(car);
        }

        System.out.println("All cars added to the dealership:");
        for (Car car : dealership.getCars()) {
            System.out.println(car);
        }
    }
}
