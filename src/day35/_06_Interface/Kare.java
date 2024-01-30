package day35._06_Interface;

public class Kare implements IGeometri {
    int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alani() {
        return this.kenar * this.kenar;
    }

    @Override
    public double cevresi() {
        return (this.kenar + this.kenar) * 2;
    }
}
