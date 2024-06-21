package com.alexis_ramos.best_travel.repositories;

import com.alexis_ramos.best_travel.domain.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, String> {

}
