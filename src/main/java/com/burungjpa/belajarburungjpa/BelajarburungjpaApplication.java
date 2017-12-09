package com.burungjpa.belajarburungjpa;

import com.burungjpa.belajarburungjpa.entity.Burung;
import com.burungjpa.belajarburungjpa.repository.BurungRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BelajarburungjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarburungjpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner burungJpa (BurungRepo burungRepo){
		return args -> {
			burungRepo.save(new Burung("Perkutut", "BurungAJA", 1000000));
			burungRepo.save(new Burung("Balam", "BurungAJA", 1000000));
			burungRepo.save(new Burung("Merpati", "BurungAJA", 1000000));
			burungRepo.save(new Burung("Jalak", "BurungAJA", 1000000));
		};
	}
}
