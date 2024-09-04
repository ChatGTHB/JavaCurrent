package day33._04_Inheritance;

public class Vehicle {
    private String color;
    private int engineCapacity;
    private String brand;

    public Vehicle(String color, int engineCapacity, String brand) {
        setColor(color);
        setEngineCapacity(engineCapacity);
        setBrand(brand);
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", brand='" + brand + '\'';
    }
}
