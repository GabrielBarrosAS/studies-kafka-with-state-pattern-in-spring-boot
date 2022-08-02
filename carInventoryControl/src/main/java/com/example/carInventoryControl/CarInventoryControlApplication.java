package com.example.carInventoryControl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CarInventoryControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarInventoryControlApplication.class, args);
	}

}
