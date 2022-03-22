package io.keycloak.myclientkeycloak.dao;

import io.keycloak.myclientkeycloak.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
