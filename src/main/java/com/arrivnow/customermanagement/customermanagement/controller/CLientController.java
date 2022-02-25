package com.arrivnow.customermanagement.customermanagement.controller;

import com.arrivnow.customermanagement.customermanagement.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.arrivnow.customermanagement.customermanagement.repository.ClientRepository;
import com.arrivnow.customermanagement.customermanagement.services.ClientServices;

import java.util.List;
import java.util.UUID;

@RestController
public class CLientController {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ClientServices clientServices;

    @PostMapping("/clients")
    public Client addnewClient(@RequestBody Client client)
    {
        UUID uuid = UUID.randomUUID();
        client.setUuid(uuid);
        return      clientRepository.save(client);
    }

    @GetMapping("/getClient")
    public Client getCLientByUUid(@RequestParam String uuid)
    {
        UUID uid = UUID.fromString(uuid);
       return clientServices.getCLientInfoByUuid(uid);
    }

    @PutMapping("/update_client_profile")
    public Client updateClient(@RequestBody Client client)
    {
        return clientServices.updateCLient(client);

    }

    @PutMapping("/approveCLient")
    public Client updateStatus(@RequestBody boolean status ,UUID uuid)
    {
        Client client = clientServices.getCLientInfoByUuid(uuid);
        client.setApproved(status);
        return clientRepository.save(client);

    }

    @GetMapping("/clients")
    public List<Client> getALLClients()
    {
        return clientServices.getAllClients();

    }






}
