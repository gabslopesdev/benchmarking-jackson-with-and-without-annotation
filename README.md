# Benchmarking Jackson
This repository serves as a demonstration of benchmarking scenarios comparing the performance of the Jackson library, both with and without annotations.

## Display results

| | avg st (nanoseconds) | avg dt (nanoseconds) | max st (nanoseconds) | min st (nanoseconds) | max dt (nanoseconds) | avg dt (nanoseconds)|
|---------------------------------------|---------------------------------------|---------------------------------------|---------------------------------------|---------------------------------------|---------------------------------------|---------------------------------------|
| **without annotation** | 85284 | 26764 | 363717769 | 3245 | 33915551 | 3245 |
| **with JsonProperty** | 10499 | 5814 | 32653672 | 2571 | 610235 | 2571 |
| **with JsonCreator and JsonProperty** | 5290 | 4184 | 5956497 | 1367 | 123012 | 1572 |

**Labels:**

- **avg st:** Average Serialization Time
- **avg dt:** Average Deserialization Time
- **max st:** Longest Serialization Time
- **min st:** Shortest Serialization Time
- **max dt:** Longest Deserialization Time
- **min dt:** Shortest Deserialization Time
