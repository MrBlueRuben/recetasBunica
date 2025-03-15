package com.recetasbunica.fppbunica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FppbunicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FppbunicaApplication.class, args);
	}

}
