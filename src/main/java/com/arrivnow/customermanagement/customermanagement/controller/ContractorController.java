package com.arrivnow.customermanagement.customermanagement.controller;

import com.arrivnow.customermanagement.customermanagement.domain.Client;
import com.arrivnow.customermanagement.customermanagement.domain.ClientContractors;
import com.arrivnow.customermanagement.customermanagement.domain.Contractor;
import com.arrivnow.customermanagement.customermanagement.dto.ContractorRequestDto;
import com.arrivnow.customermanagement.customermanagement.services.ClientContractorServices;
import com.arrivnow.customermanagement.customermanagement.services.ClientServices;
import com.arrivnow.customermanagement.customermanagement.services.ContractorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ContractorController
{
    @Autowired
    ContractorServices contractorServices;

    @Autowired
    ClientServices clientServices;

    @Autowired
    ClientContractorServices clientContractorServices;

   @PostMapping("/contractors")
    public Contractor addContractor(@RequestBody ContractorRequestDto contractorRequestDto)
    {
        return contractorServices.addNewContractor(contractorRequestDto);
    }

    @GetMapping("/getAllContractorsByclient")
    public List<Contractor> getCoNtractor(@RequestParam String clientid)
    {
        UUID uuid=UUID.fromString(clientid);
        List<Contractor> contractors = clientContractorServices.getALlContractorsByCLient(uuid);

      return contractors;
    }

    @GetMapping("/contractorinfoByCLient")
    public Contractor getCOntarctorInfoByCLientAndContractor(@RequestParam String contractoruuid ,@RequestParam String clientuuid)
    {
        UUID cuuid =UUID.fromString(clientuuid);
        UUID contracuuid= UUID.fromString(contractoruuid);
        Client client = clientServices.getCLientInfoByUuid(cuuid);
        Contractor contractor = contractorServices.getContractorInfoByUUId(contracuuid);
       return  clientContractorServices.getContarctorByClientANdCOntarctor(client, contractor);

    }

    @GetMapping("/contractorInfo")
    public Contractor getContractorInfo(@RequestParam String contractoruuid)
    {
        UUID uuid =UUID.fromString(contractoruuid);
        Contractor contractor =contractorServices.getContractorInfoByUUId(uuid);

        return  contractor;

    }

@PutMapping("/updateContractor")
    public Contractor updateContarctorProfile(@RequestBody Contractor contractor)
    {

      Contractor contractor1= contractorServices.updateContractor(contractor);
      return contractor1;

    }



















}
