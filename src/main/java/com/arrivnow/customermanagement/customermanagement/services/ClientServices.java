package com.arrivnow.customermanagement.customermanagement.services;

import com.arrivnow.customermanagement.customermanagement.domain.Client;
import com.arrivnow.customermanagement.customermanagement.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientServices
{
    @Autowired
    ClientRepository clientRepository;

    public Client getCLientInfoByUuid(UUID uuid)
    {
        Optional<Client> client=clientRepository.findByUuid(uuid);
        client.get().getEmail();
       return client.get();
    }

    public Client updateCLient(Client client)
    {

        return clientRepository.save(client);
    }


    public List<Client> getAllClients()
    {
        return clientRepository.findAll();


    }
}
