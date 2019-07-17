package com.home.configuration;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.home.repo.MongoRepo;


@EnableMongoRepositories(basePackageClasses = MongoRepo.class)
@Configuration
public class MongoDBConfiguration {

	
	@Bean
	CommandLineRunner commandLineRunner(MongoRepo mongoRepo) {
		return strings -> {
			mongoRepo.deleteAll();
		
		};
	}
}
