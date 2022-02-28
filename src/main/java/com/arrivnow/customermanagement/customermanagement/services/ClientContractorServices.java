package com.arrivnow.customermanagement.customermanagement.services;

import com.arrivnow.customermanagement.customermanagement.domain.Client;
import com.arrivnow.customermanagement.customermanagement.domain.ClientContractors;
import com.arrivnow.customermanagement.customermanagement.domain.Contractor;
import com.arrivnow.customermanagement.customermanagement.repository.ClientContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ClientContractorServices
{
    @Autowired
    ClientContractorRepository clientContractorRepository;

    @Autowired
    ClientServices clientServices;


    public ClientContractors addorUpdate(ClientContractors clientContractors)
    {

        return clientContractorRepository.save(clientContractors);

    }

    public List<Contractor> getALlContractorsByCLient(UUID clientuuid)
    {
        List<Contractor> mlist = new ArrayList<>();
        mlist.clear();
       Client client =  clientServices.getCLientInfoByUuid(clientuuid);
       List <ClientContractors> clientContractors= clientContractorRepository.findByClientId(client.getId());
        System.out.println(clientContractors.toArray());
        for (ClientContractors clientcontractor:
             clientContractors) {
            mlist.add(clientcontractor.getContractor());

        }
       return mlist ;

    }



    public Contractor getContarctorByClientANdCOntarctor(Client client,Contractor contractor)
    {


      List<ClientContractors> clientContractors=clientContractorRepository.findByClientIdAndContractorId(client.getId(),contractor.getId());
      return clientContractors.get(0).getContractor();



    }



}
