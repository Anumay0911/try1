package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.journal;
import com.example.demo.repository.journalRepository;

@Service
public class journalService {
	
	private journalRepository repo;

	public journalService(journalRepository repo) {
		super();
		this.repo = repo;
	}
	
	public journal saveJournal(journal s) {
		return repo.save(s);
	}
	
	public List<journal> getAllJournals() {
		return repo.findAll();
	}

}
