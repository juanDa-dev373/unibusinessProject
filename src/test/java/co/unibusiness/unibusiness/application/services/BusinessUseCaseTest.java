package co.unibusiness.unibusiness.application.services;

import co.unibusiness.unibusiness.application.ports.input.BusinessUseCase;
import co.unibusiness.unibusiness.domain.dtos.AddBusinessDTO;
import co.unibusiness.unibusiness.domain.model.HistoryReview;
import co.unibusiness.unibusiness.domain.model.Location;
import co.unibusiness.unibusiness.domain.model.Schedule;
import co.unibusiness.unibusiness.domain.model.TypeBusiness;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
public class BusinessUseCaseTest {
    @Autowired
    private BusinessUseCase businessUseCase;
    @Test
    public void addBusiness() throws Exception {
        AddBusinessDTO addBusinessDTO = new AddBusinessDTO(
                "hamburguesa",
                "esto es un ejemplo",
                "667c9b0927e70c40d0eaddba",
                new Location(75.77777,4.1232213),
                new ArrayList<>(Arrays.asList("photo1.png","photo2.png")),
                TypeBusiness.RESTAURANTE,
                new ArrayList<>(Arrays.asList(new Schedule("2:59:00", "Martes", "7:30:59"))),
                new ArrayList<>(Arrays.asList("43123")),
                null
        );
        String answer = businessUseCase.addBusiness(addBusinessDTO);
        Assertions.assertEquals(answer, "The Business was registered");
    }


}
