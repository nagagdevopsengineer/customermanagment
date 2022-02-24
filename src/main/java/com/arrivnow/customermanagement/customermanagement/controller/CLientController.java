package com.arrivnow.customermanagement.customermanagement.controller;

import com.arrivnow.customermanagement.customermanagement.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.arrivnow.customermanagement.customermanagement.repository.ClientRepository;

@RestController
public class CLientController {

    @Autowired
    ClientRepository clientRepository;

    @PostMapping("/clients")
    public Client addnewClient(@RequestBody Client client)
    {
        return      clientRepository.save(client);


    }
}
