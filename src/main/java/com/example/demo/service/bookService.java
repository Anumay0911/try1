package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.book;
import com.example.demo.repository.bookRepository;

@Service
public class bookService {
	
	private bookRepository repo;

	public bookService(bookRepository repo) {
		super();
		this.repo = repo;
	}
	
	public book saveBook(book s) {
		return repo.save(s);
	}
	
	public List<book> getAllBooks() {
		return repo.findAll();
	}

}
