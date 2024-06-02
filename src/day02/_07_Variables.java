package day02;

public class _07_Variables {

    public static void main(String[] args) {

        int side = 5; // int side, perimeter; I can declare multiple variables on the same line

        int perimeter = side + side + side + side;

        /**
         int perimeter;
         perimeter=side+side+side+side;
         */

        System.out.println("Environment of the Field = " + perimeter);
        System.out.println("Perimeter of the field = " + (4 * side)); // it can also be like this

        /**
         * Find the perimeter of the field with 4 equal sides, given one side.
         * <p>
         * 1- Start
         * 2- Read side
         * 3- Perimeter = side + side + side + side
         * 4- Write perimeter
         * 5- Stop
         */
    }
}
