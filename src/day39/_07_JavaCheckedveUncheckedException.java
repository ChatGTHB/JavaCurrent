package day39;

public class _07_JavaCheckedveUncheckedException {  // throws InterruptedException
    public static void main(String[] args) {
        String word = "";  // Using 'word' instead of 'kelime' for English consistency

        // Unchecked Exception Example
        try {
            char firstChar = word.charAt(0); // This can throw a StringIndexOutOfBoundsException
            System.out.println("First character: " + firstChar);
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("An error occurred: The string is empty.");
        }

        // Checked Exception Example
        try {
            System.out.println("Pausing for 1 second...");
            Thread.sleep(1000);  // This throws InterruptedException (Checked Exception)
        } catch (InterruptedException e) {
            System.out.println("An error occurred: Thread was interrupted.");
        }

        System.out.println("Program completed.");
    }
}
