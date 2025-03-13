package DeepCopy;

import java.io.*;
import java.util.Arrays;

public class DeepCopyMain2 {
    public static void main(String[] args) {
        SerializationCopy student = new SerializationCopy("직렬왕", new int[]{50, 60, 70});

        SerializationCopy studentCopy = deepCopy(student);
        studentCopy.getScore()[0] = 90;

        System.out.println("student.getScore() = " + Arrays.toString(student.getScore()));
        System.out.println("studentCopy.getScore() = " + Arrays.toString(studentCopy.getScore()));

        System.out.println("student = " + student);
        System.out.println("studentCopy = " + studentCopy);

    }
    // 직렬화 기반 Deep Copy
    public static <T extends Serializable> T deepCopy(T object) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(object);    // 객체 직렬화

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);    // 역직렬화
            return (T) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Deep copy 실패", e);
        }
    }
}
