package com.arrivnow.customermanagement.customermanagement.services;

import com.arrivnow.customermanagement.customermanagement.domain.ClientContractors;
import com.arrivnow.customermanagement.customermanagement.repository.ClientContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientContractorServices
{
    @Autowired
    ClientContractorRepository clientContractorRepository;


    public ClientContractors addorUpdate(ClientContractors clientContractors)
    {

        return clientContractorRepository.save(clientContractors);

    }
}
