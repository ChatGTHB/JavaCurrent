package Gun34._05_Polymorphism;

public class Hayvan {
    private String name;

    public Hayvan(String name) {
        setName(name);
    }

    public void ses() {
        System.out.println("ses çıkardı");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
