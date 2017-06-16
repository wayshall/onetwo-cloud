package org.onetwo.cloud.ms.user;

import org.onetwo.dbm.spring.EnableDbm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableDbm
public class UserApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
