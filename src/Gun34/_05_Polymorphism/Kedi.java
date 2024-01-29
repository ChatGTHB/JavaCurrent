package Gun34._05_Polymorphism;

public class Kedi extends Hayvan {
    public Kedi(String name) {
        super(name);
    }
    @Override
    public void ses() {
        System.out.println("Miyavladı");
    }

    public void tirmaladi() {
        System.out.println("tırmaladı");
    }
}
