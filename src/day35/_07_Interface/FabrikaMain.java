package day35._07_Interface;

public class FabrikaMain {

    public static void main(String[] args) {

        TeslaCar tc = new TeslaCar(310, "model 5");
        System.out.println(tc.changeBattery());
        System.out.println(tc.drive());

        Bus b = new Bus(7000, "IVECO");
        System.out.println(b.drive());
        System.out.println(b.changeDiesel());

        ToyotaPirus tp = new ToyotaPirus(1200, "sedan");
        System.out.println(tp.drive());
        System.out.println(tp.changeOil());
        System.out.println(tp.changeBattery());
    }
}
