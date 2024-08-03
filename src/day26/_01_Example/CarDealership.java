package day26._01_Example;

import java.util.ArrayList;
import java.util.Scanner;

public class CarDealership {
    public static void main(String[] args) {
        ArrayList<Car> dealership = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Loop to take input for 20 cars
        for (int i = 0; i < 20; i++) {
            Car car = new Car();

            System.out.print("Car Number: ");
            car.carNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            System.out.print("Car Brand: ");
            car.brand = scanner.nextLine();
            System.out.print("Car Production Year: ");
            car.productionYear = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            dealership.add(car);
        }

        printDealership(dealership); // Method to print all cars
        printAverageProductionYear(dealership); // Method to print average production year
        int averageYear = getAverageProductionYear(dealership); // Method to get average production year
        System.out.println("Average Production Year = " + averageYear);
    }

    // Method to get the average production year
    public static int getAverageProductionYear(ArrayList<Car> dealership) {
        int totalProductionYear = 0;
        for (Car car : dealership) {
            totalProductionYear += car.productionYear;
        }
        return totalProductionYear / dealership.size();
    }

    // Method to print the average production year
    public static void printAverageProductionYear(ArrayList<Car> dealership) {
        int totalProductionYear = 0;
        for (Car car : dealership) {
            totalProductionYear += car.productionYear;
        }
        System.out.println("Average Production Year = " + (totalProductionYear / dealership.size()));
    }

    // Method to print all cars in the dealership
    public static void printDealership(ArrayList<Car> dealership) {
        for (Car car : dealership) {
            System.out.println("Car Number: " + car.carNo + ", Brand: " + car.brand + ", Production Year: " + car.productionYear);
        }
    }
}
