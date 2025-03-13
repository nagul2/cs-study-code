package DeepCopy;

public class CopyConstructor {
    private String name;
    private int[] score;

    // 일반 생성자
    public CopyConstructor(String name, int[] score) {
        this.name = name;
        this.score = score;
    }

    // 복사 생성자
    public CopyConstructor(CopyConstructor student) {
        this.name = student.name;           // String은 불변 객체라 그대로 가능
        this.score = student.score.clone(); // 배열 필드 Deep Copy
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }
}
