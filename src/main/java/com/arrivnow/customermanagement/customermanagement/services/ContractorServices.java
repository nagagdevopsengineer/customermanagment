package com.arrivnow.customermanagement.customermanagement.services;

import com.arrivnow.customermanagement.customermanagement.domain.Client;
import com.arrivnow.customermanagement.customermanagement.domain.ClientContractors;
import com.arrivnow.customermanagement.customermanagement.domain.Contractor;
import com.arrivnow.customermanagement.customermanagement.dto.ContractorRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ContractorServices
{
    @Autowired
    ClientServices clientServices;

    @Autowired
    ClientContractorServices clientContractorServices;





    public Contractor addNewContractor(ContractorRequestDto contractorRequestDto)
    {
        Contractor contractor = new Contractor();
        contractor.setEmail(contractorRequestDto.getEmail());
        contractor.setContactNumber(contractorRequestDto.getPhonenumber());
        UUID contractoruuid= UUID.randomUUID();
        UUID clientcontractorsuuid=UUID.randomUUID();
        contractor.setUuid(contractoruuid);
        ClientContractors clientContractors = new ClientContractors();
        clientContractors.setUuid(clientcontractorsuuid);
        Client client= clientServices.getCLientInfoByUuid(contractorRequestDto.getClientuuid());
        clientContractors.setClient(client);
        clientContractors.setContractor(contractor);
        ClientContractors clientContractors1= clientContractorServices.addorUpdate(clientContractors);
        return clientContractors1.getContractor();


    }





}
