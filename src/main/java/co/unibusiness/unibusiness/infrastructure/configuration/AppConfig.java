package co.unibusiness.unibusiness.infrastructure.configuration;

import co.unibusiness.unibusiness.application.ports.output.BusinessPort;
import co.unibusiness.unibusiness.application.ports.output.ClientPort;
import co.unibusiness.unibusiness.application.services.BusinessService;
import co.unibusiness.unibusiness.application.services.ClientService;
import co.unibusiness.unibusiness.infrastructure.adapters.output.interService.BusinessRepository;
import co.unibusiness.unibusiness.infrastructure.adapters.output.interService.ClientRepository;
import co.unibusiness.unibusiness.infrastructure.repositories.BusinessRepo;
import co.unibusiness.unibusiness.infrastructure.repositories.ClientRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ClientPort clientPort(ClientRepo clientRepo){
        return new ClientRepository(clientRepo);
    }
    @Bean
    public ClientService clientService(ClientPort clientPort){
        return new ClientService(clientPort);
    }
    @Bean
    public BusinessPort businessPort(BusinessRepo businessRepo){return new BusinessRepository(businessRepo);
    }
    @Bean
    public BusinessService businessService(BusinessPort businessPort){return new BusinessService(businessPort)}
}
