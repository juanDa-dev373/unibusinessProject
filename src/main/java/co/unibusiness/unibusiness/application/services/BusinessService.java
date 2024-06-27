package co.unibusiness.unibusiness.application.services;

import co.unibusiness.unibusiness.application.ports.input.BusinessUseCase;
import co.unibusiness.unibusiness.application.ports.output.BusinessPort;
import co.unibusiness.unibusiness.domain.dtos.*;
import co.unibusiness.unibusiness.domain.model.Business;
import co.unibusiness.unibusiness.domain.model.StateBusiness;
import co.unibusiness.unibusiness.domain.model.StateRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusinessService implements BusinessUseCase {
    private final BusinessPort repository;
    @Autowired
    public BusinessService(BusinessPort repository){
        this.repository = repository;
    }
    @Override
    public String addBusiness(AddBusinessDTO addBusinessDto, String token) throws Exception {
        Business business = new Business();
        if(repository.findByName(addBusinessDto.name()).isPresent()){
            throw new Exception("The business already exists");
        }
        business.setDescription(addBusinessDto.description());
        business.setStateBusiness(StateBusiness.PENDING);
        business.setName(addBusinessDto.name());
        business.setLocation(addBusinessDto.location());
        business.setState(StateRecord.ACTIVE);
        business.setIdClient(addBusinessDto.idClient());
        business.setImages(addBusinessDto.images());
        business.setPhone(addBusinessDto.phone());
        business.setTypeBusiness(addBusinessDto.typeBusiness());
        business.setTimeSchedules(addBusinessDto.timeSchedules());
        business.setReview(addBusinessDto.review());
        return repository.save(business);
    }

    @Override
    public String updateBusiness(UpdateBusinessDTO updateBusinessDTO, String token) throws Exception {
        return "";
    }

    @Override
    public String deleteBusiness(DeleteBusinessDTO deleteBusinessDTO, String token) throws Exception {
        return "";
    }

    @Override
    public List<Business> searchBusinessLocation(LocationDTO locationDTO) throws Exception {
        return List.of();
    }

    @Override
    public List<Business> searchBusiness(String type) throws Exception {
        return List.of();
    }

    @Override
    public List<Business> searchName(String name) throws Exception {
        return List.of();
    }

    @Override
    public List<Business> listBusinessOwner(String token) throws Exception {
        return List.of();
    }

    @Override
    public String registrerReview(RegistrerReviewDTO registrerReviewDTO) throws Exception {
        return "";
    }

    @Override
    public Business search(String id) throws Exception {
        return null;
    }

    @Override
    public List<Business> listBusinessModerator(String token) throws Exception {
        return List.of();
    }

    @Override
    public List<Business> allBusiness() throws Exception {
        return List.of();
    }
}
