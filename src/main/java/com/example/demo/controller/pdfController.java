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
import com.example.demo.model.donations;
import com.example.demo.model.pdf;
import com.example.demo.service.donationsService;
import com.example.demo.service.pdfService;

@Controller
@RequestMapping("/pdf")
public class pdfController {
	
	private pdfService ds;
//	private donationsService serv;
	
	public pdfController(pdfService ds) {
		super();
		this.ds = ds;
//		this.serv = serv;
	}
	
	@GetMapping("/display")
	public String display() {
		return "pdf";
	}
	
	@PostMapping("/insertPdf")
	public ResponseEntity<pdf> savePdf(pdf ob) {
		return new ResponseEntity<pdf>(ds.savePdf(ob),HttpStatus.CREATED);
	}
	
	@GetMapping("/showPdfs")
	public String showPdfs(Model m) {
		List<pdf> u=ds.getAllPdfs();
		m.addAttribute("users",u);
		return "pdfDisplay";
	}
	
	@PostMapping("/submit")
	public String uploadFile(pdf u,MultipartFile photo) {
		String path="D:\\Users\\User\\eclipse-workspace\\donations\\src\\main\\webapp\\uploads";
		fileHandler.saveFile(photo, path);
		u.setFile(photo.getOriginalFilename());
		u.setApproved("pending");
//		u.setType("Pdf");
		ds.savePdf(u);
//		donations d=new donations(u.getDnid(),u.getType());
//		serv.saveDonation(d);
		return "pdf";
	}

}
