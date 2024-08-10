package day27._01_Example;

public class Utility {
    // Static method to generate a random number up to a given limit
    static int getRandomNumberStatic(int limit) {
        return (int) (Math.random() * limit);
    }

    // Non-static method to generate a random number up to a given limit
    int getRandomNumber(int limit) {
        return (int) (Math.random() * limit);
    }
}
