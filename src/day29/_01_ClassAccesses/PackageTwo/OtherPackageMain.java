package day29._01_ClassAccesses.PackageTwo;

import day29._01_ClassAccesses.PackageOne.PublicAccess;

public class OtherPackageMain {
    public static void main(String[] args) {
        PublicAccess publicAccess = new PublicAccess();
        // DefaultAccess defaultAccess = new DefaultAccess();
        // Cannot access a class with default access modifier from another package.
        // It is only accessible within its own package.
    }
}
