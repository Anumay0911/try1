package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.thesis;
import com.example.demo.repository.thesisRepository;

@Service
public class thesisService {
	
	private thesisRepository repo;

	public thesisService(thesisRepository repo) {
		super();
		this.repo = repo;
	}
	
	public thesis saveThesis(thesis s) {
		return repo.save(s);
	}
	
	public List<thesis> getAllThesis() {
		return repo.findAll();
	}

}
