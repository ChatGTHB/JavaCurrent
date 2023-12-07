package day07;

public class _02_StringLastIndexOf {
    public static void main(String[] args) {

        // indexOf : Starts the search from the beginning, gives the room number
        // lastIndexOf: starts searching from the end, gives the room number again
        // room numbers, that is, the index, are always the same, they DO NOT change depending on the search direction

        //           0123456789012
        String sentence = "Hello World!";
        System.out.println("indexOf(a) = " + sentence.indexOf("l"));             // 2
        System.out.println("lastIndexOf(a) = " + sentence.lastIndexOf("l")); // 9
    }
}
