package immutability;

public class MutableMain {
    public static void main(String[] args) {
        MutableClass user1 = new MutableClass("김이름");
        MutableClass user2 = user1;

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

        user2.setName("박이름");   // user2의 이름을 변경
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
    }
}
