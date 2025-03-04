package immutability;

public class ImmutableClass {

    private final String name;

    public ImmutableClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ImmutableClass setName(String name) {
        return new ImmutableClass(name);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
