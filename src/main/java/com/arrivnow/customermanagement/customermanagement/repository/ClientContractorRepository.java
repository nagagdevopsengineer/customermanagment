package com.arrivnow.customermanagement.customermanagement.repository;

import com.arrivnow.customermanagement.customermanagement.domain.ClientContractors;
import com.arrivnow.customermanagement.customermanagement.services.ClientServices;
import org.springframework.data.repository.CrudRepository;

public interface ClientContractorRepository extends CrudRepository<ClientContractors,Long>
{
}
