package finalex;

public class FinalMemberClass {
    private final String name;
    private final int age;

    public FinalMemberClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
//        this.name = name;
    }

    public String getName() {
        return name;
    }
}
