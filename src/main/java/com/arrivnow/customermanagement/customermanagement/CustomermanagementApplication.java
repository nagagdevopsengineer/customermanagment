package com.arrivnow.customermanagement.customermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
@RestController
public class CustomermanagementApplication
{

    private final RestTemplate restTemplate;



    @Autowired
    public CustomermanagementApplication(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @GetMapping("/test")
    public String TestApi(){
        /*try {
            callUser();
        } catch (ServiceUnavailableException e) {
            e.printStackTrace();
        }*/
        return "test";
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomermanagementApplication.class, args);
    }





}
