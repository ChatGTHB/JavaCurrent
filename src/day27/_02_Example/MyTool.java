package day27._02_Example;

public class MyTool {

    static int getMin(int a, int b) {
        return Math.min(a, b);
    }

    static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    static int getRandom(int sinir) {
        return (int) (Math.random() * sinir);
    }

    static double getUsAl(int a, int b) {
        return Math.pow(a, b);
    }

    static double getKareKok(int a) {
        return Math.sqrt(a);
    }
}
