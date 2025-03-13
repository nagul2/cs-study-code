package jackson;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final DeepCopyUtil deepCopyUtil;

	// 생성자 주입
	public DemoApplication(DeepCopyUtil deepCopyUtil) {
		this.deepCopyUtil = deepCopyUtil;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student original = new Student("스프링왕", new int[]{100, 90, 80});

		// Deep Copy 수행
		Student copied = deepCopyUtil.deepCopy(original, Student.class);

		// 복사본 배열의 특정 요소를 수정하여 독립성 검증
		copied.getScore()[0] = 50;

		// 결과 출력
		System.out.println("원본 객체: " + original);
		System.out.println("복사된 객체: " + copied);
		System.out.println("원본 객체: " + Arrays.toString(original.getScore()));
		System.out.println("복사된 객체: " + Arrays.toString(copied.getScore()));
	}
}
