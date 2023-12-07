package day08;

public class _05_StringTrim {
    public static void main(String[] args) {

        // trim(): Deletes unnecessary spaces at the beginning and end of the string

        String text = "    Joseph Burns   ";

        System.out.println("text = ->" + text + "<-");
        System.out.println("text = ->" + text.trim() + "<-");
    }
}
