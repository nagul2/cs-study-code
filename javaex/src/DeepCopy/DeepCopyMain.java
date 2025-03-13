package DeepCopy;

import java.util.Arrays;

public class DeepCopyMain {
    public static void main(String[] args) {
        CopyConstructor student = new CopyConstructor("사람", new int[]{10, 20, 30});

        // 생성한 student를 생성자를 통해 복사
        CopyConstructor studentCopy = new CopyConstructor(student);
        studentCopy.getScore()[0] = 50;

        System.out.println("student.getScore() = " + Arrays.toString(student.getScore()));
        System.out.println("studentCopy.getScore() = " + Arrays.toString(studentCopy.getScore()));

        System.out.println("student = " + student);
        System.out.println("studentCopy = " + studentCopy);
    }
}
