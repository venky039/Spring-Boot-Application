package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.BloodDonor;
import com.example.demo.repository.DonorRepo;

@SpringBootApplication
@EnableDiscoveryClient
public class BloodDonorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodDonorsApplication.class, args);
	}
	
	@Bean 
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			private DonorRepo repo;
			
			@Override
			public void run(String ...strings ) throws Exception{
				repo.save(new BloodDonor(101,"Raj","A+ve","47/1-Mumbai",876545675,LocalDate.of(2020, 12, 01)));
				repo.save(new BloodDonor(102,"Raj2","A-ve","47/1-Mumbai",876545675,LocalDate.of(2020, 11, 01)));
				repo.save(new BloodDonor(103,"Raj3","B+ve","47/1-Mumbai",876545675,LocalDate.of(2020, 10, 01)));
				repo.save(new BloodDonor(104,"Raj4","A-ve","47/1-Mumbai",876545675,LocalDate.of(2020, 9, 01)));
				repo.save(new BloodDonor(105,"Raj5","AB+ve","47/1-Mumbai",876545675,LocalDate.of(2020, 8, 01)));
				repo.save(new BloodDonor(106,"Raj6","O+ve","47/1-Mumbai",876545675,LocalDate.of(2020, 12, 02)));
			
				//repo.save(new BloodDonor(107,"Raj6","A+ve","47/1-Mumbai",876545675,LocalDate.of(2020, 12, 01)));	
				
			}
		};
	}

}
