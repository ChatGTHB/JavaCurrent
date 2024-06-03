package day03;

public class _05_Example {

    public static void main(String[] args) {

        /**
         * Question :
         * The user received 2 donations.
         * Assign their integer amounts to 2 variables as 500 and 1000 TL.
         * Then print the total donation amount.
         */

        int donate01 = 500;
        int donate02 = 1000;

        int total = donate01 + donate02;

        System.out.println("Total donation amount = " + total + " ₺");
        System.out.println("Total donation aounmt = " + (donate01 + donate02) + " ₺");
    }
}
