package day42;

// Task 52
public class MarkList {

    int num;

    public static void graceMarks(MarkList obj4) {  // named obj4 in the function, but actually obj1 and obj2
        obj4.num += 10;                              // the object itself is passed, just like an array
    }

    public static void main(String[] args) {
        MarkList obj1 = new MarkList();  // only one object is created
        MarkList obj2 = obj1;  // obj2 references the same object as obj1; no new object is created
        MarkList obj3 = null;  // no object is created here yet

        obj2.num = 60;
        graceMarks(obj2);
    }
}
