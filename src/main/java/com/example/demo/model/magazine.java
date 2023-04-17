package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="magazine")
public class magazine {
	
	@Id
	@GeneratedValue
	private long mid;
	@Column(name="title", nullable=false)
	private String title;
	@Column(name="publisher", nullable=false)
	private String publisher;
	@Column(name="file", nullable=true)
	private String file;
	@Column(name="issueDate", nullable=false)
	private String issueDate;
	@Column(name="description", nullable=false)
	private String description;
	@Column(name="category", nullable=false)
	private String category;
	@Column(name="keywords", nullable=false)
	private String keywords;
	@Column(name="edition", nullable=false)
	private int edition;
	@Column(name="donorName", nullable=true)
	private String donorName;
	@Column(name="donationDate", nullable=false)
	private String donationDate;
	@Column(name="approved", nullable=false)
	private String approved;
	
	public long getMid() {
		return mid;
	}
	public void setMid(long mid) {
		this.mid = mid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
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
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
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
	
	public magazine(long mid, String title, String publisher, String file, String issueDate, String description,
			String category, String keywords, int edition, String donorName, String donationDate, String approved) {
		super();
		this.mid = mid;
		this.title = title;
		this.publisher = publisher;
		this.file = file;
		this.issueDate = issueDate;
		this.description = description;
		this.category = category;
		this.keywords = keywords;
		this.edition = edition;
		this.donorName = donorName;
		this.donationDate = donationDate;
		this.approved = approved;
	}
	public magazine() {
		super();
	}
	

}
