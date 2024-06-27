package co.unibusiness.unibusiness.infrastructure.adapters.output.interService;

import co.unibusiness.unibusiness.application.ports.output.ClientPort;
import co.unibusiness.unibusiness.domain.model.Client;
import co.unibusiness.unibusiness.infrastructure.adapters.output.converter.ClientConverter;
import co.unibusiness.unibusiness.infrastructure.entity.ClientEntity;
import co.unibusiness.unibusiness.infrastructure.repositories.ClientRepo;

import java.util.List;
import java.util.Optional;

public class ClientRepository implements ClientPort {
    private final ClientRepo repository;
    public ClientRepository(ClientRepo repository) {
        this.repository = repository;
    }
    @Override
    public Optional<Client> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Client> findByEmail(String email) {
        Optional<Client> optionalClient = repository.findByEmail(email).map(ClientConverter::toClient);
        return optionalClient;
    }

    @Override
    public Optional<Client> findByNickName(String nickName) {
        Optional<Client> client = repository.findByNickname(nickName).map(ClientConverter::toClient);
        return client;
    }

    @Override
    public List<Client> findAll() {
        return List.of();
    }

    @Override
    public String save(Client client) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setEmail(client.getEmail());
        clientEntity.setName(client.getName());
        clientEntity.setNickname(client.getNickname());
        clientEntity.setCity(client.getCity());
        clientEntity.setProfilePhoto(client.getProfilePhoto());
        clientEntity.setState(client.getState());
        repository.save(clientEntity);
        return "the client has been saved";
    }

    @Override
    public String delete(Client client) {
        return "";
    }
}
