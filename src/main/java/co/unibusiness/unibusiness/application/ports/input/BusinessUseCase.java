package co.unibusiness.unibusiness.application.ports.input;

import co.unibusiness.unibusiness.domain.dtos.*;
import co.unibusiness.unibusiness.domain.model.Business;

import java.util.List;

public interface BusinessUseCase {
    String addBusiness(AddBusinessDTO addBusinessDto , String token) throws Exception;
    String updateBusiness(UpdateBusinessDTO updateBusinessDTO, String token) throws Exception;
    String deleteBusiness(DeleteBusinessDTO deleteBusinessDTO, String token) throws Exception;
    List<Business> searchBusinessLocation(LocationDTO locationDTO) throws Exception;
    List<Business> searchBusiness(String type) throws Exception;
    List<Business> searchName(String name) throws Exception;
    List<Business> listBusinessOwner(String token) throws Exception;
    String registrerReview(RegistrerReviewDTO registrerReviewDTO) throws Exception;
    Business search(String id) throws Exception;
    List<Business> listBusinessModerator(String token) throws Exception;
    List<Business> allBusiness() throws Exception;
}
