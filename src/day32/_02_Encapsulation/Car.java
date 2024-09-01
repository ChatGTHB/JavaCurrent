package day32._02_Encapsulation;

public class Car {
    private String color;
    private int modelYear;
    private double engineCapacity;
    private int numberOfDoors;

    public Car() {
    }

    public Car(String color, int modelYear, double engineCapacity, int numberOfDoors) {
        setEngineCapacity(engineCapacity);
        setModelYear(modelYear);
        setColor(color);
        setNumberOfDoors(numberOfDoors);
        // We address potential issues by using the setter methods to set values.
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors <= 7)
            this.numberOfDoors = numberOfDoors;
        else
            System.out.println("Invalid number of doors");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", modelYear=" + modelYear +
                ", engineCapacity=" + engineCapacity +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
