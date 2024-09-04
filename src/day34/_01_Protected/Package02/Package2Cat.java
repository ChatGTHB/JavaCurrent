package day34._01_Protected.Package02;

import day34._01_Protected.Package01.Package1Animal;

public class Package2Cat extends Package1Animal {
    public Package2Cat(String name, String breed) {
        super.name = name;
        super.breed = breed; // Unlike default, protected allows access in other packages if extended
    }
}
