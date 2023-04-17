package com.example.demo.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.donations;
import com.example.demo.service.donationsService;

public class donationController {
	
	private donationsService serv;

	public donationController(donationsService serv) {
		super();
		this.serv = serv;
	}
	
	@GetMapping("/showDonations")
	public String showDonations(Model m) {
		List<donations> u=serv.getAllDonations();
		m.addAttribute("users",u);
		return "donationsDisplay";
	}

}
