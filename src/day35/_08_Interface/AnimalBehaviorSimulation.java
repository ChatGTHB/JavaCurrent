package day35._08_Interface;

import java.util.ArrayList;

public class AnimalBehaviorSimulation {
    public static void main(String[] args) {
        ArrayList<IAnimal> animals = new ArrayList<>();

        animals.add(new Swallow());
        animals.add(new Cat());
        animals.add(new Shark());
        animals.add(new Duck());

        for (IAnimal animal : animals) {
            System.out.println(animal.food());

            if (animal instanceof IFlying) {
                IFlying flyingAnimal = (IFlying) animal;
                System.out.println(flyingAnimal.flies());
            }

            if (animal instanceof ISailing) {
                ISailing sailingAnimal = (ISailing) animal;
                System.out.println(sailingAnimal.swim());

                if (animal instanceof Duck) {
                    Duck duck = (Duck) animal;
                    System.out.println(duck.walk());
                }
            }

            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.println(cat.sound());
            }

            System.out.println("--------------------------------");
        }
    }
}
