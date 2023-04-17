package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.handler.fileHandler;
import com.example.demo.model.book;
import com.example.demo.model.donations;
import com.example.demo.service.bookService;
import com.example.demo.service.donationsService;

@Controller
@RequestMapping("/book")
public class bookController {
	
	private bookService ds;
//	private donationsService serv;
	
	public bookController(bookService ds) {
		super();
		this.ds = ds;
//		this.serv = serv;
	}
	
	@GetMapping("/display")
	public String display() {
		return "book";
	}
	
	@PostMapping("/insertBook")
	public ResponseEntity<book> saveBook(book ob) {
		return new ResponseEntity<book>(ds.saveBook(ob),HttpStatus.CREATED);
	}
	
	@GetMapping("/showBooks")
	public String showBooks(Model m) {
		List<book> u=ds.getAllBooks();
		m.addAttribute("users",u);
		return "bookDisplay";
	}
	
	@PostMapping("/submit")
	public String uploadFile(book u,MultipartFile photo) {
		String path="D:\\Users\\User\\eclipse-workspace\\donations\\src\\main\\webapp\\uploads";
		fileHandler.saveFile(photo, path);
		u.setFile(photo.getOriginalFilename());
		u.setApproved("pending");
//		u.setType("Book");
		ds.saveBook(u);
//		donations d=new donations(u.getDnid(),u.getType());
//		serv.saveDonation(d);
		return "book";
	}

}
