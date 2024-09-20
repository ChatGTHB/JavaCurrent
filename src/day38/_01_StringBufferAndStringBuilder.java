package day38;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        // Example of String concatenation
        String sentence = "";

        sentence = sentence + "Today"; // + operator concatenates strings
        sentence = sentence + " the weather";
        sentence = sentence + " is cold";

        System.out.println(sentence + " and snowy");
        System.out.println(sentence); // if not assigned, the previous state remains

        sentence.concat(", we are missing the summer"); // concat also concatenates strings
        System.out.println(sentence); // but concat doesn't affect unless reassigned
        sentence = sentence.concat(", we are missing the summer"); // reassignment required
        System.out.println(sentence);

        System.out.println("\n****   StringBuilder *****");

        /****   StringBuilder Example *****/
        String sentence2 = "Today" + // no reassignment needed
                " the weather" +
                " is cold";

        System.out.println(sentence2);

        // Why are there 3 ways to concatenate (+, concat, append)?

        long startTime = System.currentTimeMillis();
        String test1 = "";
        for (int i = 0; i < 30000; i++) {
            test1 = test1 + " hello";  // using + operator
        }
        System.out.println("+ operator time = " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        String test2 = "";
        for (int i = 0; i < 30000; i++) {
            test2 = test2.concat(" hello");  // using concat method
        }
        System.out.println("concat method time = " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder test3 = new StringBuilder();
        for (int i = 0; i < 30000; i++) {
            test3.append(" hello");  // using StringBuilder append method
        }
        System.out.println("StringBuilder time = " + (System.currentTimeMillis() - startTime) + " ms");

        // Performance conclusion:
        // If there are a few concatenations (3 or fewer), + can be used for simplicity.
        // For up to 10 concatenations, concat can be used.
        // If many string manipulations are required, StringBuilder is much faster and more efficient.
        // Due to its structure, StringBuilder performs significantly better for multiple concatenations.

        System.out.println("***********************\n\n");

        /****** Exploring StringBuilder Methods *****/
        StringBuilder sb = new StringBuilder();
        sb.append("Today");  // appends to itself, no reassignment needed
        sb.append(" the weather");
        sb.append(" is cold");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());  // length of the string
        sb.append(4); // appends other types (like int) as strings
        System.out.println("sb = " + sb);

        sb.reverse(); // reverses the string
        System.out.println("sb = " + sb);
        sb.reverse(); // reversing again
        System.out.println("sb = " + sb);

        sb.delete(0, 5); // deletes characters from index 0 to 5 (5 excluded)
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3); // deletes the character at index 3
        System.out.println("sb = " + sb);

        sb.insert(5, "word "); // inserts "word" at index 5
        System.out.println("sb = " + sb);

        sb = new StringBuilder("Today the weather is cold");
        System.out.println("sb = " + sb);
        sb.replace(3, 8, "this");  // replaces characters from index 3 to 8 with "this"
        System.out.println("sb = " + sb);

        String strSb = sb.toString(); // converts StringBuilder to a regular String for using string methods

        /****** StringBuffer Example *****/
        StringBuffer sBuffer = new StringBuffer();  // exactly the same as StringBuilder
        // The only difference is that StringBuffer is thread-safe and can be used in parallel/concurrent environments.
        // For example, in a game where multiple enemies attack at the same time and a log is recording actions,
        // StringBuffer ensures thread-safe concatenation of logs from parallel processes.
    }
}
