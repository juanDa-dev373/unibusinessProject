package co.unibusiness.unibusiness.infrastructure.repositories;

import co.unibusiness.unibusiness.infrastructure.entity.BusinessEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusinessRepo extends MongoRepository<BusinessEntity, String> {

}
