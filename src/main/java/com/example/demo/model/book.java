package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class book {
	
	@Id
	@GeneratedValue
	private long bid;
	@Column(name="title", nullable=false)
	private String title;
	@Column(name="author", nullable=false)
	private String author;
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
	@Column(name="edition", nullable=false)
	private int edition;
	@Column(name="donorName", nullable=true)
	private String donorName;
	@Column(name="donationDate", nullable=false)
	private String donationDate;
	@Column(name="approved", nullable=false)
	private String approved;
	
	public long getBid() {
		return bid;
	}
	public void setBid(long bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
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
	public book(long bid, String title, String author, String publisher, String file, String description,
			String category, String keywords, int edition, String donorName, String donationDate, String approved) {
		super();
		this.bid = bid;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.file = file;
		this.description = description;
		this.category = category;
		this.keywords = keywords;
		this.edition = edition;
		this.donorName = donorName;
		this.donationDate = donationDate;
		this.approved = approved;
	}
	public book() {
		super();
	}
	

}
