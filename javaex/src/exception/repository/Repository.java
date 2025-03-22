package exception.repository;

import exception.CheckedException;
import exception.UnCheckedException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Repository {
    private final Map<Integer, String> map = new HashMap<>();

    public int exceptionSave(String str) {
        map.put(1, str);
        int count = 0;

        try {
            throw new CheckedException("체크예외가 발생해버림");
        } catch (CheckedException e) {
            System.out.println("출력문을 로그라고 생각하고 발생한 예외를 로그로 기록해야지~ " + e);
            throw new RuntimeException(e);
        }
    }

    public int runtimeExceptionSave(String str) {
        map.put(1, str);
        throw new UnCheckedException("저장시 예외가 발생해버림");
    }
    //    public int exceptionSave(String str) {
//        map.put(1, str);
//        int count = 0;
//        try {
//            throw new CheckedException("체크예외가 발생해버림");
//        } catch (CheckedException e) {
//            System.out.println("예외 잡아 버리기");
//            return ++count;
//        }

//    }
}
