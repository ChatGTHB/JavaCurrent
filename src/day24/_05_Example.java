package day24;

import java.util.HashMap;
import java.util.Scanner;

public class _05_Example {
    public static void main(String[] args) {
        // A live dictionary application is desired.
        // Display a menu to the user as follows:
        // 1- Add (In this option, get the word itself and its meaning)
        // 2- Update (In this option, let the user correct the meaning of a word)
        // 3- List
        // 4- Search (In this option, display the meaning of a given word)
        // 5- Delete
        // 6- Exit

        // We need to access both the word and its meaning
        Scanner intScanner = new Scanner(System.in);
        Scanner strScanner = new Scanner(System.in);
        HashMap<String, String> dictionary = new HashMap<>();
        int choice = 0;

        do {
            // Show the menu to the user
            System.out.print("MENU\n1-ADD\n2-UPDATE\n3-LIST" +
                    "\n4-SEARCH\n5-DELETE\n6-EXIT\nYour choice=");
            choice = intScanner.nextInt();

            // Perform the action based on the user's choice
            switch (choice) {
                case 1: // Add operation
                    System.out.print("Enter the word=");
                    String word = strScanner.nextLine();
                    System.out.print("Meaning=");
                    String meaning = strScanner.nextLine();
                    dictionary.put(word, meaning);
                    System.out.println("Add operation completed");
                    break;
                case 2: // Update operation
                    System.out.print("Enter the word to update=");
                    word = strScanner.nextLine();
                    if (dictionary.containsKey(word)) {
                        System.out.print("New meaning=");
                        meaning = strScanner.nextLine();
                        dictionary.put(word, meaning);
                        System.out.println("Update operation completed");
                    } else {
                        System.out.println("Word not found");
                    }
                    break;
                case 3: // List operation
                    System.out.println("Dictionary contents:");
                    for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 4: // Search operation
                    System.out.print("Enter the word to search=");
                    word = strScanner.nextLine();
                    System.out.println("Meaning: " + dictionary.get(word));
                    break;
                case 5: // Delete operation
                    System.out.print("Enter the word to delete=");
                    word = strScanner.nextLine();
                    if (dictionary.containsKey(word)) {
                        dictionary.remove(word);
                        System.out.println("Delete operation completed");
                    } else {
                        System.out.println("Word not found");
                    }
                    break;
            }
        } while (choice != 6);

        System.out.println("Exiting...");
    }
}
