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
import com.example.demo.model.thesis;
import com.example.demo.service.donationsService;
import com.example.demo.service.thesisService;

@Controller
@RequestMapping("/thesis")
public class thesisController {
	
	private thesisService ds;
//	private donationsService serv;
	
	public thesisController(thesisService ds) {
		super();
		this.ds = ds;
//		this.serv = serv;
	}
	
	@GetMapping("/display")
	public String display() {
		return "thesis";
	}
	
	@PostMapping("/insertThesis")
	public ResponseEntity<thesis> saveThesis(thesis ob) {
		return new ResponseEntity<thesis>(ds.saveThesis(ob),HttpStatus.CREATED);
	}
	
	@GetMapping("/showThesis")
	public String showThesis(Model m) {
		List<thesis> u=ds.getAllThesis();
		m.addAttribute("users",u);
		return "thesisDisplay";
	}
	
	@PostMapping("/submit")
	public String uploadFile(thesis u) {
		u.setApproved("pending");
//		u.setType("Thesis");
		ds.saveThesis(u);
//		donations d=new donations(u.getDnid(),u.getType());
//		serv.saveDonation(d);
		return "thesis";
	}

}
