package com.medassist.prescription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = {"com.medassist.prescription.*"})

@SpringBootApplication
public class PrescriptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrescriptionApplication.class, args);
	}

}
