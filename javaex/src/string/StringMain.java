package string;

public class StringMain {
    public static void main(String[] args) {

//        User user = new User();

        String str1 = "문자열이다";
        String str2 = "문자열이다";

        String str3 = new String("뉴 문자열이다");
        String str4 = new String("뉴 문자열이다");

        System.out.println("str1 == str2 비교: " + (str1 == str2));
        System.out.println("str3 == str4 비교: " + (str3 == str4));

        new StringBuffer();
/*
        System.out.println(str1.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(str1)));
        System.out.println(str2.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(str2)));


        System.out.println(str3.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(str3)));
        System.out.println(str4.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(str4)));
*/

    }

//    static class User {
//    }

}
