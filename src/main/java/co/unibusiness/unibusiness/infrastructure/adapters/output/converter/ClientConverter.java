package co.unibusiness.unibusiness.infrastructure.adapters.output.converter;

import co.unibusiness.unibusiness.domain.model.Client;
import co.unibusiness.unibusiness.infrastructure.adapters.output.entity.ClientEntity;

public class ClientConverter {
    public static Client toClient(ClientEntity clientEntity){
        Client client = new Client();
        client.setEmail(clientEntity.getEmail());
        client.setPassword(clientEntity.getPassword());
        client.setNickname(clientEntity.getNickname());
        client.setCity(clientEntity.getCity());
        client.setProfilePhoto(clientEntity.getProfilePhoto());
        client.setId(clientEntity.getId());
        return client;
    }
}
