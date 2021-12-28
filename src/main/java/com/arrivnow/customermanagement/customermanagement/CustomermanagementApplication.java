package com.arrivnow.customermanagement.customermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CustomermanagementApplication
{

    @GetMapping("/test")
    public String TestApi(){
        return "Hello Pawan";
    }

	public static void main(String[] args) {
		SpringApplication.run(CustomermanagementApplication.class, args);
	}

}
