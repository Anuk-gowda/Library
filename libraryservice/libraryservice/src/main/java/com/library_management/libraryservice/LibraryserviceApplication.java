package com.library_management.libraryservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // This annotation enables the Eureka server functionality
public class LibraryserviceApplication {


	public static void main(String[] args) {
		SpringApplication.run(LibraryserviceApplication.class, args);
		System.out.println("library Server Started");
	}
}
