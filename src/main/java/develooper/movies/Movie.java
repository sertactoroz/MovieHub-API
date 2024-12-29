package develooper.movies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)  // or any other naming strategy you prefer
public class Movie {
    @Id
    @JsonProperty(value = "id")
    private ObjectId id;
    @JsonProperty(value = "imdbId")
    private String imdbId;
    @JsonProperty(value = "title")
    private String title;
    @JsonProperty(value = "releaseDate")
    private String releaseDate;
    @JsonProperty(value = "trailerLink")
    private String trailerLink;
    @JsonProperty(value = "genres")
    private List<String> genres;
    @JsonProperty(value = "poster  ")
    private String poster;
    @JsonProperty(value = "backdrops")
    private List<String> backdrops;
    @DocumentReference
    @JsonProperty(value = "reviewIds")
    private List<Review> reviewIds;


//    public Movie(String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> backdrops, List<String> genres) {
//        this.imdbId = imdbId;
//        this.title = title;
//        this.releaseDate = releaseDate;
//        this.trailerLink = trailerLink;
//        this.poster = poster;
//        this.backdrops = backdrops;
//        this.genres = genres;
//    }
}