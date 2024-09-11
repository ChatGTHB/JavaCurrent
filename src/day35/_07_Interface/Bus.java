package day35._07_Interface;

public class Bus extends Vehicle implements IDiesel {

    public Bus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeDiesel() {
        return "Refuel diesel every 700 km";
    }

    @Override
    public String drive() {
        return "Drive slowly";
    }
}
