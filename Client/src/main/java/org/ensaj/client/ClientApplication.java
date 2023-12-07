package org.ensaj.client;

import org.ensaj.client.Model.Client;
import org.ensaj.client.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication

public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
    @Bean
    CommandLineRunner initialiserMYSQL(ClientRepository clientRepository){
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"), "MAKAOUI REDA", Float.parseFloat("22")));
            clientRepository.save(new Client(Long.parseLong("2"), "MAKAOUI YOUNES", Float.parseFloat("21")));
            clientRepository.save(new Client(Long.parseLong("3"), "MAKAOUI SAAD", Float.parseFloat("22")));
        };
    }
}
