package co.unibusiness.unibusiness.application.ports.output;

import co.unibusiness.unibusiness.domain.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientPort {
    Optional<Client> findById(int id);
    Optional<Client> findByEmail(String email);
    Optional<Client> findByNickName(String nickName);
    List<Client> findAll();
    String save(Client client);
    String delete(Client client);
}
