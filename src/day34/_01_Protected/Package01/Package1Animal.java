package day34._01_Protected.Package01;

public class Package1Animal {

    public String name;       // accessible from everywhere
    protected String breed;   // accessible from the same package + subclasses
    int age;                  // accessible only from the same package
    private String color;     // accessible only within the class
}
