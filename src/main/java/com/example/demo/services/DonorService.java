package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BloodDonor;
import com.example.demo.repository.DonorRepo;

@Service
public class DonorService {

	@Autowired
	private DonorRepo repo;

	public List<BloodDonor> findAllByBloodGroup(String bloodGroup){
		return this.repo.findByBloodGroup(bloodGroup);
	}
	
	public List<BloodDonor> findAll(){
		return this.repo.findAll();
	}
	
	public BloodDonor add(BloodDonor donor){
		return this.repo.save(donor);
	}

}
