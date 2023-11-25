import scenarios.Results;
import scenarios.ScenarioWithJsonCreatorAndJsonProperty;
import scenarios.ScenarioWithJsonProperty;
import scenarios.ScenarioWithoutAnnotation;

public class Benchmarking {
    public static void main(String args[]) {
           // Scenario without annotation
           final Results wthoutAnnotation = ScenarioWithoutAnnotation.execute();
           // Scenario with JsonProperty
           final Results withJsonProperty = ScenarioWithJsonProperty.execute();
           // Scenario with JsonCreator and JsonProperty
           final Results withJsonCreatorAndJsonProperty = ScenarioWithJsonCreatorAndJsonProperty.execute();
    
           System.out.println("""
            | 
            | avg st (nanoseconds) 
            | avg dt (nanoseconds) 
            | max st (nanoseconds)
            | min st (nanoseconds)
            | max dt (nanoseconds) 
            | avg dt (nanoseconds)
            |""");
           System.out.println("""
            |---------------------------------------
            |---------------------------------------
            |---------------------------------------
            |---------------------------------------
            |---------------------------------------
            |---------------------------------------
            |---------------------------------------
            |""");
           System.out.println(  "| **without annotation** | " 
           + wthoutAnnotation.getAverageSerializationTime() + " | " 
           + wthoutAnnotation.getAverageDeserializationTime() + " | " 
           + wthoutAnnotation.getLongestSerializationTime() + " | " 
           + wthoutAnnotation.getShortestSerializationTime() + " | " 
           + wthoutAnnotation.getLongestDeserializationTime() + " | " 
           + wthoutAnnotation.getShortestDeserializationTime() + " |");
           System.out.println(  "| **with JsonProperty** | " 
           + withJsonProperty.getAverageSerializationTime() + " | " 
           + withJsonProperty.getAverageDeserializationTime() + " | " 
           + withJsonProperty.getLongestSerializationTime() + " | " 
           + withJsonProperty.getShortestSerializationTime() + " | " 
           + withJsonProperty.getLongestDeserializationTime() + " | " 
           + withJsonProperty.getShortestDeserializationTime() + " |");
           System.out.println(  "| **with JsonCreator and JsonProperty** | " 
           + withJsonCreatorAndJsonProperty.getAverageSerializationTime() + " | " 
           + withJsonCreatorAndJsonProperty.getAverageDeserializationTime() + " | " 
           + withJsonCreatorAndJsonProperty.getLongestSerializationTime() + " | " 
           + withJsonCreatorAndJsonProperty.getShortestSerializationTime() + " | " 
           + withJsonCreatorAndJsonProperty.getLongestDeserializationTime() + " | " 
           + withJsonCreatorAndJsonProperty.getShortestDeserializationTime() + " |");

               
        System.out.println("""
            **Labels:**
                - **avg st:** Average Serialization Time
                - **avg dt:** Average Deserialization Time
                - **max st:** Longest Serialization Time
                - **min st:** Shortest Serialization Time
                - **max dt:** Longest Deserialization Time
                - **min dt:** Shortest Deserialization Time
                """);
        }

}