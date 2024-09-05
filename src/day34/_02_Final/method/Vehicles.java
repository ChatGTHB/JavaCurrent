package day34._02_Final.method;

public class Vehicles {
    private String model;

    public Vehicles(String model) {
        setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public final String toString() {  // final method cannot be overridden
        return "Vehicles{" +
                "model='" + model + '\'' +
                '}';
    }
}
