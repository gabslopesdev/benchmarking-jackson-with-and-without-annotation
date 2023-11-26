# Benchmarking Jackson

This repository serves as a demonstration of benchmarking scenarios comparing the performance of the Jackson library, both with and without annotations.

## Display results

- Serialization (Java Object to Json)
- Deserialization (Json to Java Object)

| | avg st nanoseconds | avg dt nanoseconds | max st nanoseconds (milissegundos) | min st nanoseconds | max dt nanoseconds (milissegundos) | avg dt nanoseconds |
|---------------------------------------|---------------------------------------|---------------------------------------|---------------------------------------|---------------------------------------|---------------------------------------|---------------------------------------|
| **without annotation** | 78150 | 28236 | 329311188 (329) | 2876 | 31271952 (31) | 4077 |
| **with JsonProperty** | 10898 | 6108 | 32653602 (32) | 1901 | 3679437 (3) | 1901 |
| **with JsonCreator and JsonProperty** | 4771 | 5696 | 6759605 (6) | 1509 | 6304069 (6) | 1509 |

**Labels:**
    - **avg st:** Average Serialization Time
    - **avg dt:** Average Deserialization Time
    - **max st:** Longest Serialization Time
    - **min st:** Shortest Serialization Time
    - **max dt:** Longest Deserialization Time
    - **min dt:** Shortest Deserialization Time

## Conclusion

In this study, it was possible to observe that the most efficient way to use Jackson is with JsonProperty annotation together with JsonCreator. It can also be inferred that, in the context of serialization, this configuration holds greater significance compared to the deserialization proccess.
