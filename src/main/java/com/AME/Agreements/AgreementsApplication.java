package com.AME.Agreements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class AgreementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgreementsApplication.class, args);
	}

}