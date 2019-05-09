package com.techragesh.appadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AppadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppadminApplication.class, args);
	}

}
