package Gun36._02_Abstract;

public abstract class Sekil {
    private String name;

    public Sekil(String name) {
        setName(name);
    }

    abstract double alan();
    abstract double cevre();

    public void ciz(){
        System.out.println(this.name+" çizildi");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + this.name + '\'' +
                "alan='" + alan() + '\'' +
                "cevre='" + cevre() + '\'' +
                '}';
    }
}
