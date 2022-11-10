package com.homewebside.homewebsidebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class,
		ManagementWebSecurityAutoConfiguration.class })
public class HomeWebsideBackendApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(HomeWebsideBackendApplication.class, args);
	}

}
