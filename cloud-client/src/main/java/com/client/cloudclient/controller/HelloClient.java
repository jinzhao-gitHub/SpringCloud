package com.client.cloudclient.controller;

import com.client.cloudclient.service.HelloClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloClient {
    @Autowired
    private HelloClientService helloClientService;
    @GetMapping("getClient")
    public String getClient(){
        return helloClientService.getProduct();
    }

}
