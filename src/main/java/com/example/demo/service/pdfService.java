package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.pdf;
import com.example.demo.repository.pdfRepository;

@Service
public class pdfService {
	
	private pdfRepository repo;

	public pdfService(pdfRepository repo) {
		super();
		this.repo = repo;
	}
	
	public pdf savePdf(pdf s) {
		return repo.save(s);
	}
	
	public List<pdf> getAllPdfs() {
		return repo.findAll();
	}

}
