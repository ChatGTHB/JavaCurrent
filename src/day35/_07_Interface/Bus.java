package day35._07_Interface;

public class Bus extends Vehicle implements IDiesel {

    public Bus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeDiesel() {
        return "Diesel al her 700km de";
    }

    @Override
    public String drive() {
        return "yavaş sür";
    }
}
