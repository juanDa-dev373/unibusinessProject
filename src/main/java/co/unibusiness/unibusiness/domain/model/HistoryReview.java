package co.unibusiness.unibusiness.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistoryReview {
    private String description;
    private StateBusiness stateBusiness;
    private LocalDateTime date;
    private String idModerator;
    private String idBusiness;
}
