package day35._07_Interface;

public class ToyotaPirus extends Vehicle implements IElectric, IGas {
    public ToyotaPirus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "10bin de bir değiştir.";
    }

    @Override
    public String changeOil() {
        return "her 500km de Benzin al";
    }

    @Override
    public String drive() {
        return "istediğin gibi sür";
    }
}
