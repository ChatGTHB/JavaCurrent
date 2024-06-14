package day04;

public class _05_WideningCasting {

    public static void main(String[] args) {

        // 1st small area -> can be thrown into the larger area (widening)
        // byte-> short-> int-> long-> float-> double
        // absolutely no data loss

        int number = 9;
        long total = 500;
        double ratio = 3.2;

        // left side is the side that receives value, right side is the side that gives value
        ratio = number; // int ->  double  towards expansion
        System.out.println("ratio = " + ratio);  // no possibility of data loss

        total = number; // int -> long  towards expansion
        System.out.println("total = " + total); // no possibility of data loss

        ratio = total; // long -> double towards expansion
        System.out.println("ratio = " + ratio); // no possibility of data loss
    }
}
