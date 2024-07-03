package co.unibusiness.unibusiness.infrastructure.adapters.output.entity;

import co.unibusiness.unibusiness.domain.model.*;
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
@Document("Business")
public class BusinessEntity {
    @Id
    private String id;
    private String name;
    private String description;
    private String idClient;
    private Location location;
    private List<String> images;
    private TypeBusiness typeBusiness;
    private List<Schedule> timeSchedules;
    private List<String> phone;
    private HistoryReview review;
    private StateBusiness stateBusiness;
    private StateRecord state;
    private boolean open;
}
