package day33._02_Inheritance;

public class Zoo {
    public static void main(String[] args) {

        Cat cat = new Cat("black", 3, "tabby");
        System.out.println("Color = " + cat.getColor());
        cat.speak();

        Dog dog = new Dog("white", 50, "kangal");
        System.out.println("Breed = " + dog.getBreed());
        dog.speak();

        Duck duck = new Duck("green", 3, "mallard", 90);
        System.out.println(duck.getBreed());
        duck.speak();

        Snake snake = new Snake("black", 10, "viper", 300);
        System.out.println(snake.getBreed());
        System.out.println(snake);
        snake.speak();
    }
}
