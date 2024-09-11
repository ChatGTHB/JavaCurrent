package day35._07_Interface;

public class ToyotaPirus extends Vehicle implements IElectric, IGas {
    public ToyotaPirus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Change every 10,000";
    }

    @Override
    public String changeOil() {
        return "Refuel every 500 km";
    }

    @Override
    public String drive() {
        return "Drive as you like";
    }
}
