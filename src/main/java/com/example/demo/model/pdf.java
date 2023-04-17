package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pdf")
public class pdf {
	
	@Id
	@GeneratedValue
	private long pid;
	@Column(name="title", nullable=false)
	private String title;
	@Column(name="owner", nullable=false)
	private String owner;
	@Column(name="publisher", nullable=false)
	private String publisher;
	@Column(name="file", nullable=true)
	private String file;
	@Column(name="description", nullable=false)
	private String description;
	@Column(name="category", nullable=false)
	private String category;
	@Column(name="keywords", nullable=false)
	private String keywords;
	@Column(name="donorName", nullable=true)
	private String donorName;
	@Column(name="donationDate", nullable=false)
	private String donationDate;
	@Column(name="approved", nullable=false)
	private String approved;
	
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	
	public pdf(long pid, String title, String owner, String publisher, String file, String description, String category,
			String keywords, String donorName, String donationDate, String approved) {
		super();
		this.pid = pid;
		this.title = title;
		this.owner = owner;
		this.publisher = publisher;
		this.file = file;
		this.description = description;
		this.category = category;
		this.keywords = keywords;
		this.donorName = donorName;
		this.donationDate = donationDate;
		this.approved = approved;
	}
	public pdf() {
		super();
	}
	
	
	

}
