package MyApp.Entity;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@Document(collection = "MyApp")
public class JournalEntry {

    @Id
    private ObjectId id;
    @NotNull(message = "Title cannot be null")
    private String title;
    @NotNull(message = "Title cannot be null")
    private String content;
    // private LocalDateTime date;
    // private Sentiment sentiment;
}