package com.arrivnow.customermanagement.customermanagement.repository;

import com.arrivnow.customermanagement.customermanagement.domain.Contractor;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ContractorRepository extends CrudRepository<Contractor,Long>
{
    public Contractor findByUuid(UUID uuid);
}
