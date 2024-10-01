package day40;

public class Q47 {
    public static void main(String[] args) {
        String[] elements = {"A", "B"};
        int index = 0;

        for (String element : elements) {
            elements[index].concat(" element " + index); // concat cannot assign value
            // elements[index] = elements[index].concat(" element " + index); // A element 0 B element 1
            index++;
        }

        for (index = 0; index < elements.length; index++) {
            System.out.print(elements[index]); // AB
        }
    }
}
