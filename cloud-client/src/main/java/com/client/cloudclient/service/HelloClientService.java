package com.client.cloudclient.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "cloud-provider", path = "/hello")
@Component
public interface HelloClientService {

    @RequestMapping(value = "getHello")
    String getProduct();
}
