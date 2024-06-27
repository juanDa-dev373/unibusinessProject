package co.unibusiness.unibusiness.application.ports.output;

import co.unibusiness.unibusiness.domain.model.Business;

import java.util.Optional;

public interface BusinessPort {
    String save(Business business);
    Optional<Business> findByName(String name);
}
