package day08;

public class _08_StringReplaceAll {
    public static void main(String[] args) {

        // ReplaceAll: Works like replace. The difference can be given as a criterion (regex)
        // regex : regular expression / düzenli ifadeler

        String text = "Hello12 World23";

        System.out.println("text = " + text);
        System.out.println("llo -> _ = " + text.replaceAll("[llo]", "_"));  // Replace llo with _
        System.out.println("123 ->   = " + text.replaceAll("[123]", ""));   // Delete 123
        System.out.println("0-9 ->   = " + text.replaceAll("[0-9]", ""));   // Delete 0 to 9
        System.out.println("a-z ->   = " + text.replaceAll("[a-z]", ""));   // Delete a to z
        System.out.println("0-9 ->   = " + text.replaceAll("[^0-9]", ""));  // Delete OUT of 0 to 9
        System.out.println("A-Z ->   = " + text.replaceAll("[A-Z]", ""));   // Delete A to Z

        System.out.println(text.replaceAll("[A-Z]", "").replaceAll("[a-z]", "")); // Deletes all letters
    }
}
