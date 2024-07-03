package co.unibusiness.unibusiness.infrastructure.adapters.output.entity;


import co.unibusiness.unibusiness.domain.model.Account;
import co.unibusiness.unibusiness.domain.model.ListBusiness;
import co.unibusiness.unibusiness.domain.model.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document("Client")
public class ClientEntity extends Account{
    @Id
    private String id;
    private List<ListBusiness> listClient;
    private String profilePhoto;
    private String city;
    private Location location;
}
