package com.arrivnow.customermanagement.customermanagement.controller;

import com.arrivnow.customermanagement.customermanagement.domain.Client;
import com.arrivnow.customermanagement.customermanagement.domain.ClientContractors;
import com.arrivnow.customermanagement.customermanagement.domain.Contractor;
import com.arrivnow.customermanagement.customermanagement.dto.ContractorRequestDto;
import com.arrivnow.customermanagement.customermanagement.services.ClientContractorServices;
import com.arrivnow.customermanagement.customermanagement.services.ClientServices;
import com.arrivnow.customermanagement.customermanagement.services.ContractorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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



}
