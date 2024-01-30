package day35._07_Interface;

public class Vehicle { //süper class
    private double engine;
    private String model;

    public Vehicle(double engine, String model) {
        setEngine(engine);
        setModel(model);
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "engine=" + engine + ", model='" + model + '\'' + '}';
    }
}
