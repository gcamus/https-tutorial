package com.lotsys.tutorial.https.server.client;

import java.net.URI;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetingController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public String  greeting() throws Exception{
        return restTemplate.getForObject("https://localhost:8443/greeting?name={name}", String.class, "Happy Client");
    }
}