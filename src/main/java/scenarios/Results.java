package scenarios;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Results {
    private long averageSerializationTime;
    private long averageDeserializationTime;
    private long longestSerializationTime;
    private long shortestSerializationTime;
    private long longestDeserializationTime;
    private long shortestDeserializationTime;
}