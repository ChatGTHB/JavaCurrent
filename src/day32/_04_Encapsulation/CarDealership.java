package day32._04_Encapsulation;

import java.util.ArrayList;

public class CarDealership {
    private String dealershipName;
    private int maxCarCapacity;
    private final ArrayList<Car> cars = new ArrayList<>();

    // Constructor
    public CarDealership(String dealershipName, int maxCarCapacity) {
        this.dealershipName = dealershipName;
        this.maxCarCapacity = maxCarCapacity;
    }

    // Getters and Setters
    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public int getMaxCarCapacity() {
        return maxCarCapacity;
    }

    public void setMaxCarCapacity(int maxCarCapacity) {
        this.maxCarCapacity = maxCarCapacity;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    // Method to add a car to the dealership
    public boolean addCar(Car car) {
        if (cars.size() < maxCarCapacity) {
            cars.add(car);
            return true;
        }
        return false;
    }
}
