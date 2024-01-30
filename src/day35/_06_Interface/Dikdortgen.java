package day35._06_Interface;

public class Dikdortgen implements IGeometri {
    int kisaKenar;
    int uzunKenar;

    public Dikdortgen(int kisaKenar, int uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    @Override
    public double alani() {
        return this.kisaKenar * this.uzunKenar;
    }

    @Override
    public double cevresi() {
        return (this.kisaKenar + this.uzunKenar) * 2;
    }
}
