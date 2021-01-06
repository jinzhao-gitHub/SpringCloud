package com.provider.cloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudProviderApplication.class, args);
	}

}
