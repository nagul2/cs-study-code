package finalex;

public class Parent {


    final int age = 40;


    public final void finalMethod() {
        System.out.println("Parent.finalMethod");
    }

    public void notFinalMethod() {
        System.out.println("Parent.notFinalMethod");
    }


}
