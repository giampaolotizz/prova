package it.contrader;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import it.contrader.service.AbstractService;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
@SpringBootApplication//(scanBasePackages={"it.contrader","it.contrader.controller","it.contrader.converter","it.contrader.model", "it.contrader.service"})
//@ComponentScan({"it.contrader.converter"})
//@EntityScan("it.contrader.model")
//@EnableJpaRepositories("it.contrader.dao") 
public class SpringWebApplication {
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	} 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}
}
