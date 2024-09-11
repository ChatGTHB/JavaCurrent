package day35._07_Interface;

public class FactoryMain {
    public static void main(String[] args) {
        TeslaCar teslaCar = new TeslaCar(310, "Model 5");
        System.out.println(teslaCar.changeBattery());
        System.out.println(teslaCar.drive());

        Bus bus = new Bus(7000, "Iveco");
        System.out.println(bus.drive());
        System.out.println(bus.changeDiesel());

        ToyotaPirus toyotaPirus = new ToyotaPirus(1200, "Sedan");
        System.out.println(toyotaPirus.drive());
        System.out.println(toyotaPirus.changeOil());
        System.out.println(toyotaPirus.changeBattery());
    }
}
