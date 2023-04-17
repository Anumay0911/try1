package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.donations;
import com.example.demo.model.journal;
import com.example.demo.service.donationsService;
import com.example.demo.service.journalService;

@Controller
@RequestMapping("/journal")
public class journalController {
	
	private journalService ds;
//	private donationsService serv;
	
	public journalController(journalService ds) {
		super();
		this.ds = ds;
//		this.serv = serv;
	}
	
	@GetMapping("/display")
	public String display() {
		return "journal";
	}
	
	@PostMapping("/insertJournal")
	public ResponseEntity<journal> saveJournal(journal ob) {
		return new ResponseEntity<journal>(ds.saveJournal(ob),HttpStatus.CREATED);
	}
	
	@GetMapping("/showJournals")
	public String showJournals(Model m) {
		List<journal> u=ds.getAllJournals();
		m.addAttribute("users",u);
		return "journalDisplay";
	}
	
	@PostMapping("/submit")
	public String uploadFile(journal u) {
		u.setApproved("pending");
//		u.setType("Journal");
		ds.saveJournal(u);
//		donations d=new donations(u.getDnid(),u.getType());
//		serv.saveDonation(d);
		return "journal";
	}

}
