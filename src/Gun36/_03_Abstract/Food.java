package Gun36._03_Abstract;

public abstract class Food {
    private String name;

    abstract void madeIn();
    abstract void taste();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println("********");
        madeIn();
        taste();
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
