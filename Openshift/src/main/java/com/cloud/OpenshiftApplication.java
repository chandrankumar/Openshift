package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.cloud")
@SpringBootApplication
public class OpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}

}
