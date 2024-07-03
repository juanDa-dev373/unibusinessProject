package co.unibusiness.unibusiness.infrastructure.adapters.output.repositories;

import co.unibusiness.unibusiness.infrastructure.adapters.output.entity.ClientEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepo extends MongoRepository<ClientEntity, String> {
    @Query("{ 'email': ?0, 'state': 'ACTIVE' }")
    Optional<ClientEntity> findByEmail(String email);
    @Query("{ 'nickname': ?0, 'state': 'ACTIVE' }")
    Optional<ClientEntity> findByNickname(String nickname);
}
