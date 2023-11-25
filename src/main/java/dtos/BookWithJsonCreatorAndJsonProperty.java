package dtos;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class BookWithJsonCreatorAndJsonProperty {
    private final Integer id;
    private final String isbn;
    private final String title;

    @JsonCreator
    public BookWithJsonCreatorAndJsonProperty(
        @JsonProperty("id") final Integer id,  
        @JsonProperty("isbn") final String isbn, 
        @JsonProperty("title") final String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
    }

    
}
