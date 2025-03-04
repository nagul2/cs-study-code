package immutability;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableClass user1 = new ImmutableClass("김스프");
        ImmutableClass user2 = user1;   // 공유 참조는 막을 수 없다

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

        // 이름을 변경하는 것처럼 보이지만 내부에서는 객체를 생성해서 반환한다
        user2 = user2.setName("오자바");
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
    }
}
