package day34._02_Final.method;

public class Plane extends Vehicles {

    public Plane(String model) {
        super(model);
    }

    // FINAL methods cannot be overridden
//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
