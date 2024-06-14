package day04;

public class _09_Example {

    public static void main(String[] args) {

        // Find the average of 3 grades given as string ("82","95","56").

        String textGrade1 = "95";
        String textGrade2 = "82";
        String textGrade3 = "56";

        double doubleGrade1 = Double.parseDouble(textGrade1);
        double doubleGrade2 = Double.parseDouble(textGrade2);
        double doubleGrade3 = Double.parseDouble(textGrade3);

        double average = (doubleGrade1 + doubleGrade2 + doubleGrade3) / 3;
        System.out.println("average = " + average);
    }
}