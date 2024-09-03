package day33._02_Inheritance;

// Superclass
public class Animal {
    private String color;
    private int weight;
    private String breed;

    public Animal(String color, int weight, String breed) {
        setColor(color);
        setWeight(weight);
        setBreed(breed);
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                        ", weight=" + weight +
                        ", breed='" + breed + '\''
                ;
    }

    public void speak(){
        System.out.println("made a sound");
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
