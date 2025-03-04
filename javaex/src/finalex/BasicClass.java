package finalex;

public class BasicClass extends Parent {

    @Override
    public void notFinalMethod() {
        System.out.println("final키워드가 없으므로 상속받은 메서드를 재정의 할 수 있다");
    }

//    @Override
//    public void finalMethod() { // 컴파일 에러 발생
//
//    }

//    public void add(final int a, int b) {
//        a = 10;
//        b = 20;
//        System.out.println(a + b);
//    }

//    public void add(int a, int b) {
//        final int c = 50;
//        a = 10;
//        b = 20;
//        c = 30;
//    }
}
