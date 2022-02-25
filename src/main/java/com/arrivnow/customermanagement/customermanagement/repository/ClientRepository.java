package com.arrivnow.customermanagement.customermanagement.repository;

import com.arrivnow.customermanagement.customermanagement.domain.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClientRepository extends CrudRepository<Client,Long>
{
    Optional<Client> findByUuid(UUID uuid);

    List<Client> findAll();
}
