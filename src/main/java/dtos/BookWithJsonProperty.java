package dtos;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookWithJsonProperty {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("title")
    private String title;
}
