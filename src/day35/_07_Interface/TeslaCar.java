package day35._07_Interface;

public class TeslaCar extends Vehicle implements IElectric {

    public TeslaCar(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "her 100 binde battery change";
    }

    @Override
    public String drive() {
        return "auto drive";
    }
}
