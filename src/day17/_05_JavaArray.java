package day17;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Fill an array with the names of 5 TV news channels: CNN, BBC, Al Jazeera, Sky News, MSNBC.
        // Then randomly select one of them and print the selected channel to the screen.

        String[] channels = {"CNN", "BBC", "Al Jazeera", "Sky News", "MSNBC"};

        int randomIndex = (int) (Math.random() * channels.length); // Randomly generate an index from 0 to 4

        System.out.println("Randomly selected TV channel = " + channels[randomIndex]);
    }
}
