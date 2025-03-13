package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class DeepCopyUtil {

    private final ObjectMapper mapper;

    // 스프링부트에서는 ObjectMapper를 빈으로 주입받아 사용
    public DeepCopyUtil(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public <T> T deepCopy(T object, Class<T> clazz) {
        try {
            String json = mapper.writeValueAsString(object);  // 객체를 JSON 문자열로 직렬화
            return mapper.readValue(json, clazz); // 역직렬화하여 새 객체로 반환
        } catch (Exception e) {
            throw new RuntimeException("Deep Copy 실패", e);
        }
    }
}
