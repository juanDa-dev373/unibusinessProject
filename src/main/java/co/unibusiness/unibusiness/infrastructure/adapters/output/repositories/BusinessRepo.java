package co.unibusiness.unibusiness.infrastructure.adapters.output.repositories;

import co.unibusiness.unibusiness.infrastructure.adapters.output.entity.BusinessEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface BusinessRepo extends MongoRepository<BusinessEntity, String> {
    @Query("{'name': ?0}")
    Optional<BusinessEntity> findByName(String name);
}
