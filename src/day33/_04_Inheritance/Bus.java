package day33._04_Inheritance;

public class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String color, int engineCapacity, String brand, int passengerCapacity) {
        super(color, engineCapacity, brand);
        setPassengerCapacity(passengerCapacity);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", passengerCapacity='" + this.passengerCapacity + '\'';
    }
}
