package exception;

import exception.controller.Controller;

public class ExceptionMain {
    public static void main(String[] args) {
        Controller controller = new Controller();

        try {
            controller.add("저장할게요!");
        } catch (RuntimeException e) {
            System.out.println("너무너무 죄송해여 고갱님, 버그내는 개발돌이가 버그를 막 내어버렸어요 ㅠ 빨리 고치겠습니닷!");
        }
    }
}
