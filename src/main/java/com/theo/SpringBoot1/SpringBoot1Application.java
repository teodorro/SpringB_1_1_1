package com.theo.SpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(SpringBoot1Application.class, args);

		SystemProfile profile = context.getBean(SystemProfile.class);
		System.out.println(profile.getProfile());
	}

}
