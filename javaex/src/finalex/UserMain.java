package finalex;

public class UserMain {
    public static void main(String[] args) {
        final User user = new User("스파르타스파게티");
//        user = new User("새로운스파르타");

        user.name = "값을 변경할 수 있는데..";
        System.out.println("user의 이름이 변경되었다. = " + user.name);

    }
}
