package co.unibusiness.unibusiness.application.services;

import co.unibusiness.unibusiness.application.ports.input.ClientUseCase;
import co.unibusiness.unibusiness.application.ports.output.ClientPort;
import co.unibusiness.unibusiness.domain.dtos.BusinessToListDTO;
import co.unibusiness.unibusiness.domain.dtos.ItemClientDTO;
import co.unibusiness.unibusiness.domain.dtos.SignUpDTO;
import co.unibusiness.unibusiness.domain.model.Client;
import co.unibusiness.unibusiness.domain.model.ListBusiness;
import co.unibusiness.unibusiness.domain.model.StateRecord;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientService implements ClientUseCase {
    private final ClientPort repository;
    @Autowired
    public ClientService(ClientPort repository){
        this.repository = repository;
    }
    @Override
    public String signUpUser(SignUpDTO signUpDTO) throws Exception {
        Client client = new Client();
        if(existEmail(signUpDTO.email())){
            throw new Exception("There is already a registered client with this email");
        }
        if(existNickName(signUpDTO.nickname())){
            throw new Exception("There is already a registered client with this nickname");
        }
        client.setEmail(signUpDTO.email());
        client.setName(signUpDTO.name());
        client.setNickname(signUpDTO.nickname());
        client.setPassword(signUpDTO.password());
        client.setProfilePhoto(signUpDTO.photo());
        client.setCity(signUpDTO.city());
        client.setState(StateRecord.ACTIVE);
        return repository.save(client);
    }

    @Override
    public Client getClientById(String token) throws Exception {
        return null;
    }

    @Override
    public ListBusiness getListBusiness(String token, String nameList) throws Exception {
        return null;
    }

    @Override
    public List<ListBusiness> getListsBusinesses(String token) throws Exception {
        return List.of();
    }

    @Override
    public List<ItemClientDTO> listClient() {
        return List.of();
    }

    @Override
    public ListBusiness createBusinessList(String token, String listName) throws Exception {
        return null;
    }

    @Override
    public String deleteBusinessList(String token, String idList) throws Exception {
        return "";
    }

    @Override
    public String addBusinessToList(BusinessToListDTO addBusiness, String token) throws Exception {
        return "";
    }

    @Override
    public String deleteBusinessToList(BusinessToListDTO removeBusiness, String token) throws Exception {
        return "";
    }

    @Override
    public boolean existEmail(String email) throws Exception {
        return repository.findByEmail(email).isPresent();
    }

    @Override
    public boolean existNickName(String nickName) throws Exception {
        return repository.findByNickName(nickName).isPresent();
    }

    @Override
    public Client getClientId(String id) throws Exception {
        return null;
    }

    @Override
    public Client getClient(String mail) throws Exception {
        return null;
    }
}
