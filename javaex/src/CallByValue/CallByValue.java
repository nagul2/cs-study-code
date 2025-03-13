package CallByValue;

public class CallByValue {
    public static void main(String[] args) {
        // 자바는 값을 복사하여 대입한다
        int a = 1;  // a == 1
        int b = a;  // b == 1

        b = 2;  // b를 변경해도 a의 값은 1을 복사해서 넘겼기 때문에 a는 1이 유지되고 b만 2가 된다

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

        // 참조형 객체를 생성하고 myInteger1에 MyInteger() 인스턴스의 주소값을 복사하여 저장한다.
        MyInteger myInteger1 = new MyInteger();
        myInteger1.setIntValue(2);  // myInteger1에 2를 저장한다 -> 상태가 변경됨

        // MyInteger 타입 myInteger2를 만들어서 myInteger1이 가지고 있는 주소값을 복사하여 저장한다.
        MyInteger myInteger2 = myInteger1;
        myInteger2.setIntValue(3);  // myInteger2에 3를 저장한다 -> 상태가 변경됨

        // myInteger2에 myInteger1의 주소값을 저장했기 때문에 myInteger2와 myInteger1은 같은 MyInteger() 인스턴스를 가리킨다
        // 그러므로 myInteger1, myInteger2의 값은 모두 3이 된다
        System.out.println("myInteger1 = " + myInteger1.getIntValue());
        System.out.println("myInteger2 = " + myInteger2.getIntValue());

        System.out.println();

        // myInteger2 변수에 new MyInteger()로 새로운 MyInteger 객체를 생성하여 새로운 메모리 주소를 복사해서 대입한다.
        myInteger2 = new MyInteger();
        myInteger2.setIntValue(10); // 이후 myInteger2에 10을 저장한다 -> 상태가 변경됨

        // 이제 myInteger1과 myInteger2는 다른 메모리 주소를 가지고 있기 때문에 myInteger2의 상태만 변경되어 각각 3, 10을 출력한다

        // 즉, 자바는 값을 복사해서 대입하는 Call By Value이며 만약 Call By Reference 였다면
        // 지금처럼 새로운 객체가 할당되어도 myInteger1의 값도 10이 되었을 것이다.
        System.out.println("myInteger1 = " + myInteger1.getIntValue());
        System.out.println("myInteger2 = " + myInteger2.getIntValue());
    }
}
