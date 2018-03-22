package com.pnp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={
    "com.pnp",
    "com.pnp.controller",
    "com.pnp.services",
    "com.pnp.model",
    "com.pnp.repositories"})

public class PicknPay {
	public static void main(String[] args) 
        {
        //Start of main Applications
	SpringApplication.run(PicknPay.class, args);
	}
} //end of code
