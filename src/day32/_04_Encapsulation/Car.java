package day32._04_Encapsulation;

public class Car {
    private int carID; // Unique ID for each car
    private String model;
    private String brand;
    private double price;
    private static int counter = 0; // Counter for generating unique IDs

    // Constructor
    public Car(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.carID = ++counter; // Assign unique ID
    }

    // Getters and Setters
    public int getCarID() {
        return carID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
