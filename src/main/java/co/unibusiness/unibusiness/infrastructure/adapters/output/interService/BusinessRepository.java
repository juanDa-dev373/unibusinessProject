package co.unibusiness.unibusiness.infrastructure.adapters.output.interService;

import co.unibusiness.unibusiness.application.ports.output.BusinessPort;
import co.unibusiness.unibusiness.domain.model.Business;
import co.unibusiness.unibusiness.domain.model.StateBusiness;
import co.unibusiness.unibusiness.domain.model.StateRecord;
import co.unibusiness.unibusiness.infrastructure.entity.BusinessEntity;
import co.unibusiness.unibusiness.infrastructure.repositories.BusinessRepo;

import java.util.Optional;

public class BusinessRepository implements BusinessPort {
    private final BusinessRepo businessRepo;
    public BusinessRepository(BusinessRepo businessRepo) {
        this.businessRepo=businessRepo;
    }

    @Override
    public String save(Business business) {
        BusinessEntity businessEntity = new BusinessEntity();
        businessEntity.setDescription(business.getDescription());
        businessEntity.setStateBusiness(business.getStateBusiness());
        businessEntity.setName(business.getName());
        businessEntity.setLocation(business.getLocation());
        businessEntity.setState(business.getState());
        businessEntity.setIdClient(business.getIdClient());
        businessEntity.setImages(business.getImages());
        businessEntity.setPhone(business.getPhone());
        businessEntity.setTypeBusiness(business.getTypeBusiness());
        businessEntity.setTimeSchedules(business.getTimeSchedules());
        businessEntity.setReview(business.getReview());
        businessRepo.save(businessEntity);
        return "The Business was registered";
    }

    @Override
    public Optional<Business> findByName(String name) {
        return Optional.empty();
    }
}
