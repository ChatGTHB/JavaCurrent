package day31._04_EnumQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pizza> orders = new ArrayList<>();

        int selection = 0;
        do {
            showMenu();
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    Pizza smallPizza = new Pizza(PizzaSize.SMALL);
                    orders.add(smallPizza);
                    break;
                case 2:
                    Pizza mediumPizza = new Pizza(PizzaSize.MEDIUM);
                    orders.add(mediumPizza);
                    break;
                case 3:
                    Pizza largePizza = new Pizza(PizzaSize.LARGE);
                    orders.add(largePizza);
                    break;
                case 4:
                    printOrders(orders);
                    break;
            }
        } while (selection <= 4);
    }

    public static void printOrders(ArrayList<Pizza> orders) {
        int smallCount = 0, mediumCount = 0, largeCount = 0;

        for (Pizza pizza : orders) {
            if (pizza.size == PizzaSize.SMALL) smallCount++;
            else if (pizza.size == PizzaSize.MEDIUM) mediumCount++;
            else if (pizza.size == PizzaSize.LARGE) largeCount++;
        }

        System.out.println("Your Orders:");
        if (smallCount > 0) System.out.println(smallCount + " small pizza(s)");
        if (mediumCount > 0) System.out.println(mediumCount + " medium pizza(s)");
        if (largeCount > 0) System.out.println(largeCount + " large pizza(s)");
    }

    public static void showMenu() {
        System.out.println("******** Pizza Menu *******");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - Process Order & Show");
        System.out.println("5 - Exit");
        System.out.print("Your selection = ");
    }
}
