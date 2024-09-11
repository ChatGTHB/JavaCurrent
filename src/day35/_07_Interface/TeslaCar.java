package day35._07_Interface;

public class TeslaCar extends Vehicle implements IElectric {

    public TeslaCar(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Battery change every 100,000";
    }

    @Override
    public String drive() {
        return "Auto drive";
    }
}
