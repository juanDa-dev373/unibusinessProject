package co.unibusiness.unibusiness.infrastructure.repositories;

import co.unibusiness.unibusiness.application.ports.output.ClientPort;
import co.unibusiness.unibusiness.domain.model.Client;
import co.unibusiness.unibusiness.infrastructure.entity.ClientEntity;
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
