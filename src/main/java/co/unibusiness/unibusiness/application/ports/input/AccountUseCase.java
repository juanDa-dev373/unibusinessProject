package co.unibusiness.unibusiness.application.ports.input;

import co.unibusiness.unibusiness.domain.dtos.ChangePasswordDTO;
import co.unibusiness.unibusiness.domain.dtos.ProfileDTO;

public interface AccountUseCase {

    void passwordRecovery(ChangePasswordDTO changePasswordDTO) throws Exception;
    void forgotPassword(String email) throws Exception;
    void updateProfile(ProfileDTO profileDTO) throws Exception;
    String desActivateAccount(String userId) throws Exception;
    void logOutUser(String userId) throws Exception;

}
