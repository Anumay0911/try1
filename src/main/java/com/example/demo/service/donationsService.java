package com.example.demo.service;

import java.util.List;

import com.example.demo.model.donations;
import com.example.demo.repository.donationRepository;

public class donationsService {
	
	private donationRepository repo;

	public donationsService(donationRepository repo) {
		super();
		this.repo = repo;
	}
	
	public donations saveDonation(donations s) {
		return repo.save(s);
	}
	
	public List<donations> getAllDonations() {
		return repo.findAll();
	}

}
