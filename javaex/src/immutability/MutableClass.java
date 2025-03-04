package immutability;

public class MutableClass {

    private String name;

    public MutableClass(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MutableClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
