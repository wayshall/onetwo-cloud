package org.onetwo.webapp.adminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AdminServer{
	
    public static void main(String[] args) {
        SpringApplication.run(AdminServer.class, args);
    }
}
