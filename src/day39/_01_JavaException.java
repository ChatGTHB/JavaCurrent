package day39;

public class _01_JavaException {
    public static void main(String[] args) {
        // Exception -> unexpected, special case, error

        System.out.println("The program has started.");

        String word = "";
        // This will cause a Runtime Exception (StringIndexOutOfBoundsException)
        // because you're trying to access the 4th character (index 3) of an empty string.
        char letter = word.charAt(3); // Runtime Error occurs here

        System.out.println("The program has ended.");
    }
}

// Errors that occur before the program runs due to incomplete or incorrect code
// are called Compile-Time Errors, also known as Syntax Errors.
// These errors are caught by the compiler before the program is executed.

// Errors that occur while the program is running due to unexpected conditions
// are called Runtime Errors or Runtime Exceptions.
// These errors are thrown during the execution of the program and can cause it to crash.
