package com.nssmart.hakaton.appey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class AppeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppeyApplication.class, args);
	}

}
