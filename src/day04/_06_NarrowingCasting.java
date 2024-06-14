package day04;

public class _06_NarrowingCasting {

    public static void main(String[] args) {

        int total = 6700;      // 2,5 mil
        byte number = 5;       // 127
        number = (byte) total;                    // Even if there is no data loss, caution should be exercised
        System.out.println("number = " + number); // There is data loss

        double oran = 3.7;   // It is also a method used to get the integer part
        total = (int) oran;  // double -> int
        System.out.println("total = " + total);
        // There is data loss, decimal part lost
    }
}
