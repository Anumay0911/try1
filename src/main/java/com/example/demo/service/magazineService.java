package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.magazine;
import com.example.demo.repository.magazineRepository;

@Service
public class magazineService {
	
	private magazineRepository repo;

	public magazineService(magazineRepository repo) {
		super();
		this.repo = repo;
	}
	
	public magazine saveMagazine(magazine s) {
		return repo.save(s);
	}
	
	public List<magazine> getAllMagazines() {
		return repo.findAll();
	}

}
