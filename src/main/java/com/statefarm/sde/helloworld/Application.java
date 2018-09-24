package com.statefarm.sde.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.statefarm.sde.helloworld" })
public class Application {
    public static void main( String[] args ) {
    	SpringApplication.run(Application.class, args);
    }
}
