package finalex;

public class Parent {

    final int age = 40;
    int age2 = 50;

    public void age() {
//        age = 50;
        age2 = 100;
    }


    public final void finalMethod() {
        System.out.println("Parent.finalMethod");
    }

    public void notFinalMethod() {
        System.out.println("Parent.notFinalMethod");
    }


}
