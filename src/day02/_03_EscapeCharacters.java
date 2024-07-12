package day02;

public class _03_EscapeCharacters {
    public static void main(String[] args) {
        /**
         Escape Characters
         \n   -> yeni satır aç, alt satıra geç
         \t   -> tab tuşuna basılmış gibi yapar, 2,3 karakterlik boşluk oluşturur
         \b   -> backspace tuşuna basma etkisi, yani 1 karakter geri siler
         \"   -> çift tırnak " yazmak için kullanılır
         \\   -> slaç (\) yazdırmak için kullanılır
         \r   -> bulunduğu satırın başına git
         **************************************************************************************
         \n -> open new line, go to next line
         \t -> acts as if the tab key was pressed, creating a 2.3 character space
         \b -> effect of pressing backspace i.e. deletes back 1 character
         \" -> Used to write double quotes "
         \\ -> used to slur (/) print
         \r -> go to the beginning of the current line
         */

        System.out.println("HelloWorld!");   //HelloWorld!
        System.out.println("Hello\nWorld!"); //Hello, go to the bottom line, World
        System.out.println("Hello\tWorld!"); //Hello   World!
        System.out.println("Hello\bWorld!"); //HellWorld!
        System.out.println("Hello\"World!"); //Hello"World!
        System.out.println("Hello\\World!"); //Hello\World!
        System.out.println("Hello\rWorld!"); //World!
    }
}
