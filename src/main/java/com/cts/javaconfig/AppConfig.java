package com.cts.javaconfig;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public HelloWorld getBean() {
		return new HelloWorldImpl();
	}
}
