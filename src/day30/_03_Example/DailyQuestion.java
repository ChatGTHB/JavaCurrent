package day30._03_Example;

public class DailyQuestion {
    static int b = 0; // You are unique, there is only 1 for the type
    int a; // Each object has its own 'a'

    public static void main(String[] args) {
        DailyQuestion dailyQuestion1 = new DailyQuestion();
        dailyQuestion1.a = 5;

        DailyQuestion dailyQuestion2 = new DailyQuestion();
        dailyQuestion2.a = 7;

        // Task 1:
        // What is the current value of 'a'? If I print 'a', what will it display?

        // The expected answer is: "Which 'a' are you asking about, teacher?"
        System.out.println("dailyQuestion1.a = " + dailyQuestion1.a); // 5, b=0
        System.out.println("dailyQuestion2.a = " + dailyQuestion2.a); // 7, b=0

        // Task 2: What is the current value of 'b'?
        System.out.println("DailyQuestion.b = " + DailyQuestion.b); // 0

        // Task 3:
        dailyQuestion1.increment(); // dailyQuestion1.a increased by 1: 6, b increased by 1
        dailyQuestion2.increment(); // dailyQuestion2.a increased by 1: 8, b increased by 1
        // What is the current value of 'a' and 'b'?

        System.out.println("dailyQuestion1.a = " + dailyQuestion1.a); // 6
        System.out.println("dailyQuestion2.a = " + dailyQuestion2.a); // 8
        System.out.println("DailyQuestion.b = " + DailyQuestion.b); // 2
    }

    void increment() {
        a++;
        b++;
    }
}
