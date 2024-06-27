package co.unibusiness.unibusiness.application.ports.input;

import co.unibusiness.unibusiness.domain.dtos.BusinessToListDTO;
import co.unibusiness.unibusiness.domain.dtos.ItemClientDTO;
import co.unibusiness.unibusiness.domain.dtos.SignUpDTO;
import co.unibusiness.unibusiness.domain.model.Client;
import co.unibusiness.unibusiness.domain.model.ListBusiness;

import java.util.List;

public interface ClientUseCase {
    String signUpUser(SignUpDTO signUpDTO) throws Exception;
    Client getClientById(String token) throws Exception;
    ListBusiness getListBusiness(String token, String nameList) throws Exception;
    List<ListBusiness> getListsBusinesses(String token) throws Exception;
    List<ItemClientDTO> listClient() ;
    ListBusiness createBusinessList(String token, String listName) throws Exception;
    String deleteBusinessList(String token, String idList) throws Exception;
    String addBusinessToList(BusinessToListDTO addBusiness, String token) throws Exception;
    String deleteBusinessToList(BusinessToListDTO removeBusiness, String token) throws Exception;
    boolean existEmail(String email) throws Exception;
    boolean existNickName(String nickName) throws Exception;
    Client getClientId(String id) throws Exception;
    Client getClient(String mail) throws Exception;

}
