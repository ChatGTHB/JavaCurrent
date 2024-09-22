package day39;

public class _05_TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("The program has started");
        String str = "";
        long startTime = 0;

        try {
            startTime = System.currentTimeMillis();  // Get the start time
            System.out.println("Code before the error");
            char firstChar = str.charAt(3);  // This will cause an exception (StringIndexOutOfBoundsException)
            System.out.println("Code after the error");  // This line will not execute because an exception occurs above
        } catch (Exception ex) {
            System.out.println("This block executes if an error occurs");
        } finally {
            // The finally block always executes whether an exception occurs or not
            long elapsedTime = System.currentTimeMillis() - startTime;  // Calculate elapsed time
            System.out.println("Elapsed time = " + elapsedTime);
            System.out.println("Final cleanup actions after try-catch");
        }

        // These lines will still run, even after an exception
        System.out.println("Other code continues...");
        System.out.println("The program has ended");
    }
}
