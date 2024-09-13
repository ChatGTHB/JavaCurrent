package day36._03_Abstract;

public class FoodWorld {
    public static void main(String[] args) {
        Baklava baklava = new Baklava();
        CheeseCake cheeseCake = new CheeseCake();
        GreekSalad greekSalad = new GreekSalad();
        CaesarSalad caesarSalad = new CaesarSalad();

        System.out.println("Baklava: Made in " + baklava.madeIn() + ", Tastes: " + baklava.taste());
        System.out.println("CheeseCake: Made in " + cheeseCake.madeIn() + ", Tastes: " + cheeseCake.taste());
        System.out.println("GreekSalad: Made in " + greekSalad.madeIn() + ", Tastes: " + greekSalad.taste());
        System.out.println("CaesarSalad: Made in " + caesarSalad.madeIn() + ", Tastes: " + caesarSalad.taste());
    }
}
