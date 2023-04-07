package com.onlinediary;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OnlineDiaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineDiaryApplication.class, args);
	}

}
