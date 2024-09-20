package day38;

public class _04_StringComparison {
    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "hello";

        // Using '==' to compare references
        if (word1 == word2)
            System.out.println("Equal 1");  // Will print because both word1 and word2 point to the same memory location

        // Using 'equals()' to compare actual string values
        if (word1.equals(word2))
            System.out.println("Equal 2");  // Will print because their values are the same

        System.out.println("********************");

        // Example with strings created by scanner input or other dynamic ways
        String word3 = new String("hello"); // Different memory location
        String word4 = new String("hello"); // Different memory location

        // Using '==' to compare references (memory locations)
        if (word3 == word4)  // This will NOT print because word3 and word4 refer to different objects in memory
            System.out.println("Equal 3");

        // Using 'equals()' to compare values
        if (word3.equals(word4))  // Will print because the values are the same even though the references are different
            System.out.println("Equal 4");

        // Summary:
        // - '==' compares memory references, so it checks if two variables point to the same object.
        // - 'equals()' compares the actual values of the objects.
        // - For object types like Strings, arrays, ArrayLists, or any other objects,
