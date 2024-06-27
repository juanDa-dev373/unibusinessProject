package co.unibusiness.unibusiness.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private String id;
    private LocalDateTime date;
    private int rating;
    private String idClient;
    private String idBusiness;
    private String message;
    private Comment answer;
}
