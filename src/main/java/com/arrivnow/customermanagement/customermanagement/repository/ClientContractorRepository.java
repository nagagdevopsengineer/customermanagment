package com.arrivnow.customermanagement.customermanagement.repository;

import com.arrivnow.customermanagement.customermanagement.domain.ClientContractors;
import com.arrivnow.customermanagement.customermanagement.services.ClientServices;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientContractorRepository extends CrudRepository<ClientContractors,Long>
{

    public List<ClientContractors> findByClientId(Long id );

    public List<ClientContractors> findByClientIdAndContractorId(Long clientid,Long contarctorid);
}
