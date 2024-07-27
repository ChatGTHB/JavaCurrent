package day22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Example {
    public static void main(String[] args) {
        // A live dictionary is to be made,
        // Get as much information as the user wants in the form of word and meaning
        // Get 2 pieces of information.
        // Then get a word from the user and print its meaning.

        // Words in one place, meanings in another
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> meanings = new ArrayList<>();

        ArrayList<ArrayList<String>> dictionary = new ArrayList<>();
        dictionary.add(words);
        dictionary.add(meanings);

        Scanner scanner = new Scanner(System.in);

        String answer = "";
        do {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();
            words.add(word);  // dictionary.get(0).add(word);

            System.out.print("Enter its meaning: ");
            String meaning = scanner.nextLine();
            meanings.add(meaning); // dictionary.get(1).add(meaning);

            System.out.print("Do you want to continue? (Y/N): ");
            answer = scanner.nextLine();

        } while (answer.equalsIgnoreCase("Y"));

        System.out.print("Enter the word to search: ");
        String searchWord = scanner.nextLine();

        // Now let's find the search word
        for (int i = 0; i < words.size(); i++) {  // dictionary.get(0).size()
            if (words.get(i).equalsIgnoreCase(searchWord)) { // word found
                System.out.println(meanings.get(i));
            }
        }
    }
}
