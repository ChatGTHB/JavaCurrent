package day27._01_Example;

public class JavaStaticAndNonStaticMethods {
    public static void main(String[] args) {
        Utility utility = new Utility(); // Object instance
        int randomNum1 = utility.getRandomNumber(10);
        // This method is associated with the object (no static keyword).
        // If the method requires object-specific properties (fields)
        // to be used within it, meaning if variables marked with 'this'
        // are used inside the method, then it should not be static.

        int randomNum2 = Utility.getRandomNumberStatic(10);
        // Static: Already exists, does not need to be created.
        // Therefore, there's no need to create an object instance.
        // It can be used directly with the class name.
        // If the method does not use any object-specific variables,
        // static can be added for faster and more practical use.
        // Static is also used to call methods directly from anywhere in the program,
        // like tools such as Math.max().
        // Inside a static method, only other static methods can be called directly.
        // Another purpose: Static can be used in methods that concern the type itself.
    }
}
