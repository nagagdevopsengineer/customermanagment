package com.arrivnow.customermanagement.customermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.naming.ServiceUnavailableException;
import java.net.URI;
import java.util.Optional;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@EnableDiscoveryClient
public class CustomermanagementApplication
{

    private final RestTemplate restTemplate;

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    public CustomermanagementApplication(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @GetMapping("/test")
    public String TestApi(){
        try {
            callUser();
        } catch (ServiceUnavailableException e) {
            e.printStackTrace();
        }
        return "test";
    }

	public static void main(String[] args) {
		SpringApplication.run(CustomermanagementApplication.class, args);
	}



    public Optional<URI> serviceUrl(String service) {
        return discoveryClient.getInstances(service)
            .stream()
            .findFirst()
            .map(si -> si.getUri());
    }

    public String  callUser() throws ServiceUnavailableException {
        ResponseEntity<String> strttrtr=null;
        URI url = serviceUrl("usermanagement")
            .map(s -> s.resolve("/getData"))
            .orElseThrow(ServiceUnavailableException::new);
        try {
            strttrtr = restTemplate.getForEntity(url, String.class);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(strttrtr.getBody());
        return  strttrtr.getBody();
    }

}
