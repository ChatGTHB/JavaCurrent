package Gun36._02_Abstract;

public class Daire extends Sekil {
    private double yariCap;

    public Daire(String name, double yariCap) {
        super(name);
        setYariCap(yariCap);
    }

    @Override
    double alan() { // pi*r*r
        return this.yariCap * this.yariCap * Math.PI;
    }

    @Override
    double cevre() { // 2*pi*r
        return 2 * this.yariCap * Math.PI;
    }

    public double getYariCap() {
        return this.yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }
}
