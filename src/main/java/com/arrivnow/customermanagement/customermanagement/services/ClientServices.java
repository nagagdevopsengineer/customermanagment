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
        System.out.println("before getting client by uuid ");
        Optional<Client> client=clientRepository.findByUuid(uuid);

        System.out.println("-------->"+client.get().getEmail()+"------->"+client.get().getId());
       return client.get();
    }

    public Client updateCLient(Client client)
    {
       Client client1=clientRepository.findByUuid(client.getUuid()).get();
       client.setId(client1.getId());
        return clientRepository.save(client);
    }


    public List<Client> getAllClients()
    {
        return clientRepository.findAll();


    }
}
