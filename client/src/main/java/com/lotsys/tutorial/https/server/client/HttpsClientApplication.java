package com.lotsys.tutorial.https.server.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.io.File;

@SpringBootApplication
public class HttpsClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpsClientApplication.class, args);
    }


    @Bean
    public RestTemplate template() throws Exception {

        RestTemplate template = new RestTemplate();
        return template;
    }
}
