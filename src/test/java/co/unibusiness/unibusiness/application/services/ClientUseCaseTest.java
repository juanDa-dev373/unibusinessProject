package co.unibusiness.unibusiness.application.services;

import co.unibusiness.unibusiness.application.ports.input.ClientUseCase;
import co.unibusiness.unibusiness.domain.dtos.SignUpDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClientUseCaseTest {
    @Autowired
    private ClientUseCase clientUseCase;
    @Test
    void signUpClient() throws Exception{
        SignUpDTO signUpDTO = new SignUpDTO("juan david",
                "juan10F",
                "juanda.fonseca2003@gmail.com",
                "juan123",
                "photo.png",
                "ARMENIA");
        String answer = clientUseCase.signUpUser(signUpDTO);
        Assertions.assertEquals("the client has been saved", answer);
    }
}
