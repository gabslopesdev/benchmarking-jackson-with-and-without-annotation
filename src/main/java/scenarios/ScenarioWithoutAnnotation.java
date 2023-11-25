package scenarios;
import com.fasterxml.jackson.core.JsonProcessingException;

import dtos.Book;
import utils.JsonUtils;

public class ScenarioWithoutAnnotation {
    public static Results execute() {
        final int numberOfIterations = 5000;
        
        final Book book = new Book();
        book.setId(1);
        book.setIsbn("9781484256251");
        book.setTitle("Spring Boot Persistence Best Practices: Optimize Java Persistence Performance in Spring Boot Applications");


        long totalSerializeTime = 0;
        long totalDeserializeTime = 0;
        long maxSerializeTime = Long.MIN_VALUE;
        long minSerializeTime = Long.MAX_VALUE;
        long maxDeserializeTime = Long.MIN_VALUE;
        long minDeserializeTime = Long.MAX_VALUE;

        for (int i = 0; i < numberOfIterations; i++) {
            try {
                // Measure serialization time
                final long startTimeSerialize = System.nanoTime();
                final String json = JsonUtils.serialize(book);
                final long endTimeSerialize = System.nanoTime();
                final long elapsedTimeSerialize = endTimeSerialize - startTimeSerialize;
                totalSerializeTime += elapsedTimeSerialize;

                // Update maximum and minimum for serialization
                maxSerializeTime = Math.max(maxSerializeTime, elapsedTimeSerialize);
                minSerializeTime = Math.min(minDeserializeTime, elapsedTimeSerialize);

                // Measure deserialization time
                final long startTimeDeserialize = System.nanoTime();
                JsonUtils.deserialize(json, Book.class);
                final long endTimeDeserialize = System.nanoTime();
                final long elapsedTimeDeserialize = endTimeDeserialize - startTimeDeserialize;
                totalDeserializeTime += elapsedTimeDeserialize;

                // Update maximum and minimum for deserialization
                maxDeserializeTime = Math.max(maxDeserializeTime, elapsedTimeDeserialize);
                minDeserializeTime = Math.min(minDeserializeTime, elapsedTimeDeserialize);

            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }

        // Calculate the average
        final long avgSerializeTime = totalSerializeTime / numberOfIterations;
        final long avgDeserializeTime = totalDeserializeTime / numberOfIterations;

        return Results.builder()
        .averageSerializationTime(avgSerializeTime)
        .averageDeserializationTime(avgDeserializeTime)
        .longestSerializationTime(maxSerializeTime)
        .shortestSerializationTime(minSerializeTime)
        .longestDeserializationTime(maxDeserializeTime)
        .shortestDeserializationTime(minDeserializeTime)
        .build();
    }
}