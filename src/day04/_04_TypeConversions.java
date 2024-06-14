package day04;

public class _04_TypeConversions {

    public static void main(String[] args) {

        byte studentGrade1 = 9;
        byte studentGrade2 = 9;
        byte studentGrade3 = 9;
        byte studentGrade4 = 10;

        // I want to find the total grade
        int totalGrade = studentGrade1 + studentGrade2 + studentGrade3 + studentGrade4;
        byte totalGrade2 = (byte) totalGrade;  // You empty the big bucket into the small bucket
        /**
         When I put int -> byte he said wait a minute (CONTRAIN)
         There is a process of assigning a large memory reserved area to a small memory reserved area.
         There is a possibility of data loss
         */
    }
}
