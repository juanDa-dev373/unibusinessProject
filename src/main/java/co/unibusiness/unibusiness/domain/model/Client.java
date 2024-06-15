package co.unibusiness.unibusiness.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("Client")
public class Client extends Account {
    @Id
    private String id;
    private List<ListBusiness> listClient;
    private String profilePhoto;
    private String city;
    private Location location;
}
