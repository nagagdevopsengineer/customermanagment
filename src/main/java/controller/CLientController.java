package controller;

import domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.ClientRepository;

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
