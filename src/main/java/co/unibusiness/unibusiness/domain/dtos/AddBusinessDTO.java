package co.unibusiness.unibusiness.domain.dtos;

import co.unibusiness.unibusiness.domain.model.HistoryReview;
import co.unibusiness.unibusiness.domain.model.Location;
import co.unibusiness.unibusiness.domain.model.Schedule;
import co.unibusiness.unibusiness.domain.model.TypeBusiness;

import java.util.List;

public record AddBusinessDTO(
        String name,
        String description,
        String idClient,
        Location location,
        List<String> images,
        TypeBusiness typeBusiness,
        List<Schedule> timeSchedules,
        List<String> phone,
        HistoryReview review
) {
}
