package DeepCopy;

import java.io.Serializable;

public class SerializationCopy implements Serializable {
    private String name;
    private int[] score;

    // 일반 생성자
    public SerializationCopy(String name, int[] score) {
        this.name = name;
        this.score = score;
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
