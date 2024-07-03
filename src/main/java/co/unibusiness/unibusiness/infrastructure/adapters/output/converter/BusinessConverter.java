package co.unibusiness.unibusiness.infrastructure.adapters.output.converter;

import co.unibusiness.unibusiness.domain.model.Business;
import co.unibusiness.unibusiness.infrastructure.adapters.output.entity.BusinessEntity;

public class BusinessConverter {
    public static Business toBusiness(BusinessEntity businessEntity){
        Business business = new Business();
        business.setDescription(businessEntity.getDescription());
        business.setStateBusiness(businessEntity.getStateBusiness());
        business.setName(businessEntity.getName());
        business.setLocation(businessEntity.getLocation());
        business.setState(businessEntity.getState());
        business.setIdClient(businessEntity.getIdClient());
        business.setImages(businessEntity.getImages());
        business.setPhone(businessEntity.getPhone());
        business.setTypeBusiness(businessEntity.getTypeBusiness());
        business.setTimeSchedules(businessEntity.getTimeSchedules());
        business.setReview(businessEntity.getReview());


        return null;
    }
}
