package jackson;

public class Student {
    private String name;
    private int[] score;

    public Student() {
    }

    public Student(String name, int[] score) {
        this.name = name;
        this.score = score;
    }

    // 기본 생성자가 있다면 필요 없음 @JsonProperty 필요 없음
//    public Student(@JsonProperty("name") String name, @JsonProperty("scores") int[] score) {
//        this.name = name;
//        this.score = score;
//    }

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
