package com.example.mbs01;

import com.example.mbs01.daos.MovieDao;
import com.example.mbs01.entities.Movie;
import com.example.mbs01.entities.Status;
import com.example.mbs01.exceptions.StatusDetailsNotFoundException;
import com.example.mbs01.services.InitService;
import com.example.mbs01.services.MovieService;
import com.example.mbs01.services.StatusService;
import com.example.mbs01.services.impl.MovieServiceImpl;
import com.example.mbs01.services.impl.StatusServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Main class of the SpringBoot
 */
@SpringBootApplication
public class Mbs01Application {

	/**
	 * Writing logs
	 * Initialize the logger
	 *
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Mbs01Application.class);

	public static void main(String[] args) throws StatusDetailsNotFoundException {

		SpringApplication.run(Mbs01Application.class, args);



	}

	@Bean
	CommandLineRunner init(InitService initService){
		return args -> {
			System.out.println("This will be executed as soon as the application is started");
			initService.init();
		};
	}

}