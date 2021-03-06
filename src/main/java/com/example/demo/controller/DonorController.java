package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BloodDonor;
import com.example.demo.services.DonorService;

@RestController
@CrossOrigin(value="*")
public class DonorController {
	
	@Autowired
	private DonorService service;

	@GetMapping(path="/api/v1/donors/{bloodGroup}")
	public List<BloodDonor> findAllByBloodGroup(@PathVariable("bloodGroup") String bloodGroup){
				
		String name = new String("Added");
		
		System.out.println(name);
		return service.findAllByBloodGroup(bloodGroup);
		
	}
	//making changes to branch in GetMapping
	@GetMapping(path="/api/v1/donors")
	public List<BloodDonor> findAll(){
		
String name = new String("Added");
		
		System.out.println(name);
		
		return service.findAll();	}
	
	@PostMapping(path="/api/v1/donors")
	public BloodDonor add(BloodDonor donor) {
		return service.add(donor);
	}
	
	//Changed by Sundar
	public BloodDonor addFromSundar(BloodDonor donor) {
		return service.add(donor);
	}
	
	//Changed after creating the Branch
	//Another Change
	
	//Changed at 5:57PM

}
