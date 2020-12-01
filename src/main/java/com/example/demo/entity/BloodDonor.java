package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="donors")
public class BloodDonor {

	@Id
	int id;
	String donorName;
	String bloodGroup;
	String address;
	long phoneNumber;
	//@DateTimeFormat()
	LocalDate lastDonatedDate;
}
