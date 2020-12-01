package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BloodDonor;

@Repository
public interface DonorRepo extends JpaRepository<BloodDonor, Integer> {

	List<BloodDonor> findByBloodGroup(String bloodGroup);
	//@Query()  for Custom Query
	//List<Donor> findAllByBloodGroup(String bloodGroup);
	
}
