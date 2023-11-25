package utils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
    
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static String serialize(final Object obj) throws JsonProcessingException {
        return MAPPER.writeValueAsString(obj);
    }

    public static <T> T deserialize(final String json, final Class<T> valueType) throws JsonMappingException, JsonProcessingException {
        return MAPPER.readValue(json, valueType);
    }
}
