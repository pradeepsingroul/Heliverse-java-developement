package com.heliverse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.heliverse.Models.Quiz;
import com.heliverse.Services.QuizeService;

@EnableScheduling
@SpringBootApplication
public class HeliverseProjectApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(HeliverseProjectApplication.class, args);
		
	}

}
