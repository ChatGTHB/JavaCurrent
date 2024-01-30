package Gun36._02_Abstract;

public class Dikdortgen extends Sekil {
    private int uKenar;
    private int kKenar;

    public Dikdortgen(String name, int uKenar, int kKenar) {
        super(name);
        setuKenar(uKenar);
        setkKenar(kKenar);
    }

    @Override
    double alan() {
        return this.uKenar * this.kKenar;
    }

    @Override
    double cevre() {
        return (this.uKenar + this.kKenar) * 2;
    }

    public int getuKenar() {
        return uKenar;
    }

    public void setuKenar(int uKenar) {
        this.uKenar = uKenar;
    }

    public int getkKenar() {
        return kKenar;
    }

    public void setkKenar(int kKenar) {
        this.kKenar = kKenar;
    }
}
