package day04;

public class _08_Example {

    public static void main(String[] args) {

        String donation1 = "700"; // string, word
        String donation2 = "500"; // string, word

        System.out.println(donation1 + donation2); // 700500

        // I want to sum them as numbers then it is necessary to convert String -> int.
        int figureDonation1 = Integer.parseInt(donation1);  // Double.parseDouble
        int figureDonation2 = Integer.parseInt(donation2);   // Parse : means to organize and transform
        int totalDonations = figureDonation1 + figureDonation2;

        System.out.println(figureDonation1 + figureDonation2);
    }
}