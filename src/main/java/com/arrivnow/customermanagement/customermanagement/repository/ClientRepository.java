package com.arrivnow.customermanagement.customermanagement.repository;

import com.arrivnow.customermanagement.customermanagement.domain.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client,Long> {
}
